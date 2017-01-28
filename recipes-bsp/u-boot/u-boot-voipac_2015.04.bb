require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "u-boot for imx6 TinyRex/Rex boards."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=c7383a594871c03da76b3707929d2919"
COMPATIBLE_MACHINE = "(imx6-tinyrexlite|imx6-tinyrexbasic|imx6-tinyrexpro|imx6-tinyrexmax|imx6-tinyrexmax4g|imx6-tinyrexultra|imx6-rexbasic|imx6-rexpro|imx6-rexultra)"

PROVIDES += "u-boot"

PV = "v2015.04"

SRCBRANCH = "uboot-imx-v2015.04"
SRCREV = "2f59afcfbdd7d00966e0d1ad7a3d634cb1d5337f"
UBOOT_SRC ?= "git://github.com/voipac/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

LOCALVERSION ?= "-${SRCBRANCH}"

PACKAGE_ARCH = "${MACHINE_ARCH}"
