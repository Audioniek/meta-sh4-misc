COMPATIBLE_MACHINE = "adb_box"

require ${META-SH4-NAME}/recipes-bsp/linux/linux-sh4.inc

STXNUMBER = "stx7100"

FILESEXTRAPATHS_prepend := "${THISDIR}/linux-sh4:"

SRC_URI_append += "\
    file://linux-sh4-stx7100_fdma_fix_stm24_${STM_PATCH_STR}.patch;patch=1 \
    file://linux-sh4-sata_32bit_fix_stm24_${STM_PATCH_STR}.patch;patch=1 \
    file://linux-sh4-${MACHINE}_setup_stm24_${STM_PATCH_STR}.patch;patch=1 \
    file://linux-usbwait123_stm24.patch;patch=1 \
    file://linux-sh4-ufs910_reboot_stm24_${STM_PATCH_STR}.patch;patch=1 \
    file://linux-sh4-i2c-st40-pio_stm24_${STM_PATCH_STR}.patch;patch=1 \
"

MACHINE_KERNEL_PR_append = ".1"
