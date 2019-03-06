SUMMARY = "SH4 driver modules from TDT/Audioniek"
DESCRIPTION = "SH4 driver modules from TDT/Audioniek"
SECTION = "base"
PRIORITY = "required"
PACKAGE_ARCH = "${MACHINE_ARCH}"
LICENSE = " GPLv2"
LIC_FILES_CHKSUM = "file://${S}/README.md;md5=244c89982fccbe7b4861f60288c744e4"

RDEPENDS_${PN} = "stinit"

COMPATIBLE_MACHINE = "adb_box|arivalink200|hl101|pace7241|sagemcom88|tf7700|vip1_v2|vip2_v1|vitamin_hd5000"

PROVIDES = "sh4-driver-modules"
RPROVIDES_${PN} = "sh4-driver-modules"

require ${META-SH4-NAME}/recipes-bsp/drivers/sh4-driver-modules.inc

SRC_URI += " \
    file://modules.conf \
    file://modules-conf.conf \
"
