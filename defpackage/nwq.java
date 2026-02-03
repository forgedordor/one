package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nwq implements nvn {
    private static final Pattern a = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean b;
    private final nwp c;
    private final mfr d;
    private Map e;
    private float f;
    private float g;

    public nwq() {
        this(null);
    }

    private static float d(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int e(long j, List list, List list2) {
        int i;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i - 1)));
        return i;
    }

    private static long f(String str) {
        Matcher matcher = a.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = mgb.a;
        long j = Long.parseLong(strGroup) * 3600000000L;
        long j2 = Long.parseLong(matcher.group(2)) * 60000000;
        return j + j2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g(defpackage.mfr r29, java.nio.charset.Charset r30) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwq.g(mfr, java.nio.charset.Charset):void");
    }

    @Override // defpackage.nvn
    public final /* synthetic */ nva a(byte[] bArr, int i, int i2) {
        return nvj.a(this, bArr, i2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:46|(5:194|47|48|192|49)|(2:(4:52|53|188|54)(1:55)|56)(2:57|(1:59)(8:62|(1:64)|186|67|(1:69)(1:71)|72|(2:74|205)(2:75|204)|76))|60|(0)|186|67|(0)(0)|72|(0)(0)|76|44) */
    /* JADX WARN: Removed duplicated region for block: B:107:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x029f A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b5 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c9 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0303 A[LOOP:2: B:144:0x0301->B:145:0x0303, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018c A[Catch: RuntimeException -> 0x01a1, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x01a1, blocks: (B:67:0x0180, B:69:0x018c), top: B:186:0x0180 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01df  */
    @Override // defpackage.nvn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(byte[] r27, int r28, int r29, defpackage.nvm r30, defpackage.meo r31) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwq.b(byte[], int, int, nvm, meo):void");
    }

    public nwq(List list) throws NumberFormatException {
        this.f = -3.4028235E38f;
        this.g = -3.4028235E38f;
        this.d = new mfr();
        if (list == null || list.isEmpty()) {
            this.b = false;
            this.c = null;
            return;
        }
        this.b = true;
        String strJ = mgb.J((byte[]) list.get(0));
        mee.a(strJ.startsWith("Format:"));
        nwp nwpVarA = nwp.a(strJ);
        mee.f(nwpVarA);
        this.c = nwpVarA;
        g(new mfr((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    @Override // defpackage.nvn
    public final /* synthetic */ void c() {
    }
}
