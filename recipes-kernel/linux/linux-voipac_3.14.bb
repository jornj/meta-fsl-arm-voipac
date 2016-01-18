# Copyright (C) 2015 Voipac
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux kernel for for imx6q/dl/s TinyRex/Rex boards"
DESCRIPTION = "Linux kernel for for imx6q/dl/s TinyRex/Rex boards. It includes \
support for many IPs such as GPU, VPU and IPU."

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "3.14-1.0.x-mx6-tinyrex"
LOCALVERSION = "-yocto"
SRCREV = "a6c2566e40724b1103bfcf7ab536755b14837f3e"
KERNEL_SRC ?= "git://github.com/voipac/linux-fslc.git;protocol=git"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH} file://defconfig"

DEFAULT_PREFERENCE = "1"              

COMPATIBLE_MACHINE = "(mx6|imx6s-tinyrexlite|imx6s-tinyrexbasic|imx6d-tinyrexpro|imx6q-tinyrexmax|imx6q-tinyrex|imx6dl-tinyrex|imx6s-tinyrex)"
