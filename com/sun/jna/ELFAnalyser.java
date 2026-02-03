package com.sun.jna;

import defpackage.a;
import j$.nio.channels.DesugarChannels;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ELFAnalyser {
    private static final int EF_ARM_ABI_FLOAT_HARD = 1024;
    private static final int EF_ARM_ABI_FLOAT_SOFT = 512;
    private static final int EI_CLASS_64BIT = 2;
    private static final int EI_DATA_BIG_ENDIAN = 2;
    private static final byte[] ELF_MAGIC = {127, 69, 76, 70};
    private static final int E_MACHINE_ARM = 40;
    private static final int SHN_UNDEF = 0;
    private static final int SHN_XINDEX = 65535;
    private final String filename;
    private boolean ELF = false;
    private boolean _64Bit = false;
    private boolean bigEndian = false;
    private boolean armHardFloatFlag = false;
    private boolean armSoftFloatFlag = false;
    private boolean armEabiAapcsVfp = false;
    private boolean arm = false;

    /* compiled from: PG */
    static class ArmAeabiAttributesTag {
        private final String name;
        private final ParameterType parameterType;
        private final int value;
        private static final List<ArmAeabiAttributesTag> tags = new LinkedList();
        private static final Map<Integer, ArmAeabiAttributesTag> valueMap = new HashMap();
        private static final Map<String, ArmAeabiAttributesTag> nameMap = new HashMap();
        public static final ArmAeabiAttributesTag File = addTag(1, "File", ParameterType.UINT32);
        public static final ArmAeabiAttributesTag Section = addTag(2, "Section", ParameterType.UINT32);
        public static final ArmAeabiAttributesTag Symbol = addTag(3, "Symbol", ParameterType.UINT32);
        public static final ArmAeabiAttributesTag CPU_raw_name = addTag(4, "CPU_raw_name", ParameterType.NTBS);
        public static final ArmAeabiAttributesTag CPU_name = addTag(5, "CPU_name", ParameterType.NTBS);
        public static final ArmAeabiAttributesTag CPU_arch = addTag(6, "CPU_arch", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag CPU_arch_profile = addTag(7, "CPU_arch_profile", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag ARM_ISA_use = addTag(8, "ARM_ISA_use", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag THUMB_ISA_use = addTag(9, "THUMB_ISA_use", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag FP_arch = addTag(10, "FP_arch", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag WMMX_arch = addTag(11, "WMMX_arch", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag Advanced_SIMD_arch = addTag(12, "Advanced_SIMD_arch", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag PCS_config = addTag(13, "PCS_config", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag ABI_PCS_R9_use = addTag(14, "ABI_PCS_R9_use", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag ABI_PCS_RW_data = addTag(15, "ABI_PCS_RW_data", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag ABI_PCS_RO_data = addTag(16, "ABI_PCS_RO_data", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag ABI_PCS_GOT_use = addTag(17, "ABI_PCS_GOT_use", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag ABI_PCS_wchar_t = addTag(18, "ABI_PCS_wchar_t", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag ABI_FP_rounding = addTag(19, "ABI_FP_rounding", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag ABI_FP_denormal = addTag(20, "ABI_FP_denormal", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag ABI_FP_exceptions = addTag(21, "ABI_FP_exceptions", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag ABI_FP_user_exceptions = addTag(22, "ABI_FP_user_exceptions", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag ABI_FP_number_model = addTag(23, "ABI_FP_number_model", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag ABI_align_needed = addTag(24, "ABI_align_needed", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag ABI_align8_preserved = addTag(25, "ABI_align8_preserved", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag ABI_enum_size = addTag(26, "ABI_enum_size", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag ABI_HardFP_use = addTag(27, "ABI_HardFP_use", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag ABI_VFP_args = addTag(28, "ABI_VFP_args", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag ABI_WMMX_args = addTag(29, "ABI_WMMX_args", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag ABI_optimization_goals = addTag(30, "ABI_optimization_goals", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag ABI_FP_optimization_goals = addTag(31, "ABI_FP_optimization_goals", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag compatibility = addTag(32, "compatibility", ParameterType.NTBS);
        public static final ArmAeabiAttributesTag CPU_unaligned_access = addTag(34, "CPU_unaligned_access", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag FP_HP_extension = addTag(36, "FP_HP_extension", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag ABI_FP_16bit_format = addTag(38, "ABI_FP_16bit_format", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag MPextension_use = addTag(42, "MPextension_use", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag DIV_use = addTag(44, "DIV_use", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag nodefaults = addTag(64, "nodefaults", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag also_compatible_with = addTag(65, "also_compatible_with", ParameterType.NTBS);
        public static final ArmAeabiAttributesTag conformance = addTag(67, "conformance", ParameterType.NTBS);
        public static final ArmAeabiAttributesTag T2EE_use = addTag(66, "T2EE_use", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag Virtualization_use = addTag(68, "Virtualization_use", ParameterType.ULEB128);
        public static final ArmAeabiAttributesTag MPextension_use2 = addTag(70, "MPextension_use", ParameterType.ULEB128);

        /* compiled from: PG */
        public enum ParameterType {
            UINT32,
            NTBS,
            ULEB128
        }

        public ArmAeabiAttributesTag(int i, String str, ParameterType parameterType) {
            this.value = i;
            this.name = str;
            this.parameterType = parameterType;
        }

        private static ArmAeabiAttributesTag addTag(int i, String str, ParameterType parameterType) {
            ArmAeabiAttributesTag armAeabiAttributesTag = new ArmAeabiAttributesTag(i, str, parameterType);
            Map<Integer, ArmAeabiAttributesTag> map = valueMap;
            if (!map.containsKey(Integer.valueOf(armAeabiAttributesTag.getValue()))) {
                map.put(Integer.valueOf(armAeabiAttributesTag.getValue()), armAeabiAttributesTag);
            }
            Map<String, ArmAeabiAttributesTag> map2 = nameMap;
            if (!map2.containsKey(armAeabiAttributesTag.getName())) {
                map2.put(armAeabiAttributesTag.getName(), armAeabiAttributesTag);
            }
            tags.add(armAeabiAttributesTag);
            return armAeabiAttributesTag;
        }

        public static ArmAeabiAttributesTag getByName(String str) {
            return nameMap.get(str);
        }

        public static ArmAeabiAttributesTag getByValue(int i) {
            Map<Integer, ArmAeabiAttributesTag> map = valueMap;
            Integer numValueOf = Integer.valueOf(i);
            return map.containsKey(numValueOf) ? map.get(numValueOf) : new ArmAeabiAttributesTag(i, a.g(i, "Unknown "), getParameterType(i));
        }

        public static List<ArmAeabiAttributesTag> getTags() {
            return DesugarCollections.unmodifiableList(tags);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.value == ((ArmAeabiAttributesTag) obj).value;
        }

        public String getName() {
            return this.name;
        }

        public ParameterType getParameterType() {
            return this.parameterType;
        }

        public int getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value + 469;
        }

        public String toString() {
            return this.name + " (" + this.value + ")";
        }

        private static ParameterType getParameterType(int i) {
            ArmAeabiAttributesTag byValue = getByValue(i);
            return byValue == null ? i % 2 == 0 ? ParameterType.ULEB128 : ParameterType.NTBS : byValue.getParameterType();
        }
    }

    /* compiled from: PG */
    static class ELFSectionHeaderEntry {
        private final long addr;
        private final long flags;
        private final int link;
        private String name;
        private final int nameOffset;
        private final long offset;
        private final long size;
        private final int type;

        public ELFSectionHeaderEntry(boolean z, ByteBuffer byteBuffer) {
            this.nameOffset = byteBuffer.getInt(0);
            this.type = byteBuffer.getInt(4);
            this.flags = z ? byteBuffer.getLong(8) : byteBuffer.getInt(8);
            this.addr = z ? byteBuffer.getLong(16) : byteBuffer.getInt(12);
            this.offset = z ? byteBuffer.getLong(24) : byteBuffer.getInt(16);
            this.size = z ? byteBuffer.getLong(32) : byteBuffer.getInt(20);
            this.link = byteBuffer.getInt(true == z ? 40 : 24);
        }

        public long getAddr() {
            return this.addr;
        }

        public long getFlags() {
            return this.flags;
        }

        public int getLink() {
            return this.link;
        }

        public String getName() {
            return this.name;
        }

        public int getNameOffset() {
            return this.nameOffset;
        }

        public long getOffset() {
            return this.offset;
        }

        public long getSize() {
            return this.size;
        }

        public int getType() {
            return this.type;
        }

        public void setName(String str) {
            this.name = str;
        }

        public String toString() {
            return String.format("ELFSectionHeaderEntry{nameOffset=%1$d (0x%1$x), name=%2$s, type=%3$d (0x%3$x), flags=%4$d (0x%4$x), addr=%5$d (0x%5$x), offset=%6$d (0x%6$x), size=%7$d (0x%7$x), link=%8$d (0x%8$x)}", Integer.valueOf(this.nameOffset), this.name, Integer.valueOf(this.type), Long.valueOf(this.flags), Long.valueOf(this.addr), Long.valueOf(this.offset), Long.valueOf(this.size), Integer.valueOf(this.link));
        }
    }

    /* compiled from: PG */
    static class ELFSectionHeaders {
        private final List<ELFSectionHeaderEntry> entries = new ArrayList();

        public ELFSectionHeaders(boolean z, boolean z2, ByteBuffer byteBuffer, RandomAccessFile randomAccessFile) throws IOException {
            long j;
            short s;
            int size;
            short s2;
            int i;
            byte b;
            if (z) {
                j = byteBuffer.getLong(40);
                s = byteBuffer.getShort(58);
                size = byteBuffer.getShort(60);
                s2 = byteBuffer.getShort(62);
            } else {
                j = byteBuffer.getInt(32);
                s = byteBuffer.getShort(46);
                size = byteBuffer.getShort(48);
                s2 = byteBuffer.getShort(50);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(s);
            DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()).read(byteBufferAllocate, j);
            ELFSectionHeaderEntry eLFSectionHeaderEntry = new ELFSectionHeaderEntry(z, byteBufferAllocate);
            if (size != 0) {
                i = size;
            } else if (j != 0) {
                size = (int) eLFSectionHeaderEntry.getSize();
                i = 0;
            } else {
                size = 0;
                i = size;
            }
            int i2 = size * s;
            if (i2 == 0 || s2 == 0) {
                return;
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i2);
            byteBufferAllocate2.order(z2 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()).read(byteBufferAllocate2, j);
            for (int i3 = 0; i3 < i; i3++) {
                ByteBuffer byteBufferSlice = byteBufferAllocate2.slice();
                byteBufferSlice.order(byteBufferAllocate2.order());
                this.entries.add(new ELFSectionHeaderEntry(z, byteBufferSlice));
            }
            ELFSectionHeaderEntry eLFSectionHeaderEntry2 = this.entries.get(s2);
            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate((int) eLFSectionHeaderEntry2.getSize());
            byteBufferAllocate3.order(z2 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()).read(byteBufferAllocate3, eLFSectionHeaderEntry2.getOffset());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(20);
            for (ELFSectionHeaderEntry eLFSectionHeaderEntry3 : this.entries) {
                byteArrayOutputStream.reset();
                byteBufferAllocate3.position(eLFSectionHeaderEntry3.getNameOffset());
                while (byteBufferAllocate3.position() < byteBufferAllocate3.limit() && (b = byteBufferAllocate3.get()) != 0) {
                    byteArrayOutputStream.write(b);
                }
                eLFSectionHeaderEntry3.setName(byteArrayOutputStream.toString("ASCII"));
            }
        }

        public List<ELFSectionHeaderEntry> getEntries() {
            return this.entries;
        }
    }

    private ELFAnalyser(String str) {
        this.filename = str;
    }

    public static ELFAnalyser analyse(String str) throws IOException {
        ELFAnalyser eLFAnalyser = new ELFAnalyser(str);
        eLFAnalyser.runDetection();
        return eLFAnalyser;
    }

    private static Map<Integer, Map<ArmAeabiAttributesTag, Object>> parseAEABI(ByteBuffer byteBuffer) {
        HashMap map = new HashMap();
        while (byteBuffer.position() < byteBuffer.limit()) {
            int iPosition = byteBuffer.position();
            int iIntValue = readULEB128(byteBuffer).intValue();
            int i = byteBuffer.getInt();
            if (iIntValue == 1) {
                map.put(1, parseFileAttribute(byteBuffer));
            }
            byteBuffer.position(iPosition + i);
        }
        return map;
    }

    private static Map<Integer, Map<ArmAeabiAttributesTag, Object>> parseArmAttributes(ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 65) {
            while (byteBuffer.position() < byteBuffer.limit()) {
                int iPosition = byteBuffer.position();
                int i = byteBuffer.getInt();
                if (i <= 0) {
                    break;
                }
                if ("aeabi".equals(readNTBS(byteBuffer, null))) {
                    return parseAEABI(byteBuffer);
                }
                byteBuffer.position(iPosition + i);
            }
        }
        return Collections.EMPTY_MAP;
    }

    private void parseEabiAapcsVfp(ByteBuffer byteBuffer, RandomAccessFile randomAccessFile) throws IOException {
        for (ELFSectionHeaderEntry eLFSectionHeaderEntry : new ELFSectionHeaders(this._64Bit, this.bigEndian, byteBuffer, randomAccessFile).getEntries()) {
            if (".ARM.attributes".equals(eLFSectionHeaderEntry.getName())) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) eLFSectionHeaderEntry.getSize());
                byteBufferAllocate.order(this.bigEndian ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()).read(byteBufferAllocate, eLFSectionHeaderEntry.getOffset());
                Map<ArmAeabiAttributesTag, Object> map = parseArmAttributes(byteBufferAllocate).get(1);
                if (map != null) {
                    Object obj = map.get(ArmAeabiAttributesTag.ABI_VFP_args);
                    if ((obj instanceof Integer) && ((Integer) obj).equals(1)) {
                        this.armEabiAapcsVfp = true;
                    } else if ((obj instanceof BigInteger) && ((BigInteger) obj).intValue() == 1) {
                        this.armEabiAapcsVfp = true;
                    }
                }
            }
        }
    }

    private static Map<ArmAeabiAttributesTag, Object> parseFileAttribute(ByteBuffer byteBuffer) {
        HashMap map = new HashMap();
        while (byteBuffer.position() < byteBuffer.limit()) {
            ArmAeabiAttributesTag byValue = ArmAeabiAttributesTag.getByValue(readULEB128(byteBuffer).intValue());
            int iOrdinal = byValue.getParameterType().ordinal();
            if (iOrdinal == 0) {
                map.put(byValue, Integer.valueOf(byteBuffer.getInt()));
            } else if (iOrdinal == 1) {
                map.put(byValue, readNTBS(byteBuffer, null));
            } else if (iOrdinal == 2) {
                map.put(byValue, readULEB128(byteBuffer));
            }
        }
        return map;
    }

    private static String readNTBS(ByteBuffer byteBuffer, Integer num) {
        if (num != null) {
            byteBuffer.position(num.intValue());
        }
        int iPosition = byteBuffer.position();
        while (byteBuffer.get() != 0 && byteBuffer.position() <= byteBuffer.limit()) {
        }
        byte[] bArr = new byte[(byteBuffer.position() - iPosition) - 1];
        byteBuffer.position(iPosition);
        byteBuffer.get(bArr);
        byteBuffer.position(byteBuffer.position() + 1);
        try {
            return new String(bArr, "ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private static BigInteger readULEB128(ByteBuffer byteBuffer) {
        BigInteger bigIntegerOr = BigInteger.ZERO;
        int i = 0;
        while (true) {
            byte b = byteBuffer.get();
            bigIntegerOr = bigIntegerOr.or(BigInteger.valueOf(b & 127).shiftLeft(i));
            if ((b & 128) == 0) {
                return bigIntegerOr;
            }
            i += 7;
        }
    }

    private void runDetection() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.filename, "r");
        try {
            boolean z = true;
            if (randomAccessFile.length() > 4) {
                byte[] bArr = new byte[4];
                randomAccessFile.seek(0L);
                randomAccessFile.read(bArr);
                if (Arrays.equals(bArr, ELF_MAGIC)) {
                    this.ELF = true;
                }
            }
            if (this.ELF) {
                randomAccessFile.seek(4L);
                byte b = randomAccessFile.readByte();
                byte b2 = randomAccessFile.readByte();
                this._64Bit = b == 2;
                this.bigEndian = b2 == 2;
                randomAccessFile.seek(0L);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(true != this._64Bit ? 52 : 64);
                DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()).read(byteBufferAllocate, 0L);
                byteBufferAllocate.order(this.bigEndian ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                boolean z2 = byteBufferAllocate.get(18) == 40;
                this.arm = z2;
                if (z2) {
                    int i = byteBufferAllocate.getInt(true != this._64Bit ? 36 : 48);
                    this.armHardFloatFlag = (i & 1024) == 1024;
                    if ((i & 512) != 512) {
                        z = false;
                    }
                    this.armSoftFloatFlag = z;
                    parseEabiAapcsVfp(byteBufferAllocate, randomAccessFile);
                }
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public String getFilename() {
        return this.filename;
    }

    public boolean is64Bit() {
        return this._64Bit;
    }

    public boolean isArm() {
        return this.arm;
    }

    public boolean isArmEabiAapcsVfp() {
        return this.armEabiAapcsVfp;
    }

    public boolean isArmHardFloat() {
        return isArmEabiAapcsVfp() || isArmHardFloatFlag();
    }

    public boolean isArmHardFloatFlag() {
        return this.armHardFloatFlag;
    }

    public boolean isArmSoftFloatFlag() {
        return this.armSoftFloatFlag;
    }

    public boolean isBigEndian() {
        return this.bigEndian;
    }

    public boolean isELF() {
        return this.ELF;
    }
}
