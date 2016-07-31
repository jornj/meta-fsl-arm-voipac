# Copyright (C) 2016 Voipac
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux kernel for for imx6 TinyRex/Rex boards"
DESCRIPTION = "Linux kernel for for imx6 TinyRex/Rex boards. It includes \
support for many IPs such as GPU, VPU and IPU."

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "4.1-1.0.x-imx-rex"
LOCALVERSION = "-yocto"
SRCREV = "bc83a48df46548f092e7f2c619faf73e23cfa313"
KERNEL_SRC ?= "git://github.com/voipac/linux-fslc.git;protocol=git"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH} file://defconfig"

DEFAULT_PREFERENCE = "1"              

COMPATIBLE_MACHINE = "(mx6|imx6-tinyrexlite|imx6-tinyrexbasic|imx6-tinyrexpro|imx6-tinyrexmax|imx6-tinyrexultra|imx6s-tinyrex|imx6dl-tinyrex|imx6q-tinyrex|imx6-rexbasic|imx6-rexpro|imx6-rexultra|imx6dl-rex)"
