package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nwu implements nvn {
    private static final Pattern a = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern b = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder c = new StringBuilder();
    private final ArrayList d = new ArrayList();
    private final mfr e = new mfr();

    public static float d(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long e(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        mee.f(strGroup2);
        long j2 = Long.parseLong(strGroup2) * 60000;
        String strGroup3 = matcher.group(i + 3);
        mee.f(strGroup3);
        long j3 = Long.parseLong(strGroup3) * 1000;
        String strGroup4 = matcher.group(i + 4);
        long j4 = j + j2 + j3;
        if (strGroup4 != null) {
            j4 += Long.parseLong(strGroup4);
        }
        return j4 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final defpackage.mdu f(android.text.Spanned r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwu.f(android.text.Spanned, java.lang.String):mdu");
    }

    @Override // defpackage.nvn
    public final /* synthetic */ nva a(byte[] bArr, int i, int i2) {
        return nvj.a(this, bArr, i2);
    }

    @Override // defpackage.nvn
    public final void b(byte[] bArr, int i, int i2, nvm nvmVar, meo meoVar) throws NumberFormatException {
        mfr mfrVar;
        long j;
        String str;
        nwu nwuVar = this;
        mfr mfrVar2 = nwuVar.e;
        mfrVar2.I(bArr, i + i2);
        mfrVar2.K(i);
        Charset charsetA = mfrVar2.A();
        if (charsetA == null) {
            charsetA = StandardCharsets.UTF_8;
        }
        long j2 = -9223372036854775807L;
        ArrayList arrayList = (nvmVar.b == -9223372036854775807L || !nvmVar.c) ? null : new ArrayList();
        while (true) {
            String strV = mfrVar2.v(charsetA);
            int i3 = 0;
            if (strV == null) {
                break;
            }
            if (strV.length() != 0) {
                try {
                    Integer.parseInt(strV);
                    mfr mfrVar3 = nwuVar.e;
                    String strV2 = mfrVar3.v(charsetA);
                    if (strV2 == null) {
                        mff.f("SubripParser", "Unexpected end");
                        break;
                    }
                    Matcher matcher = a.matcher(strV2);
                    if (matcher.matches()) {
                        long jE = e(matcher, 1);
                        long jE2 = e(matcher, 6);
                        StringBuilder sb = nwuVar.c;
                        sb.setLength(0);
                        ArrayList arrayList2 = nwuVar.d;
                        arrayList2.clear();
                        String strV3 = mfrVar3.v(charsetA);
                        while (!TextUtils.isEmpty(strV3)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strV3.trim();
                            long j3 = j2;
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = b.matcher(strTrim);
                            int i4 = i3;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList2.add(strGroup);
                                int iStart = matcher2.start() - i4;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i4 += length;
                                matcher2 = matcher2;
                                mfrVar2 = mfrVar2;
                            }
                            sb.append(sb2.toString());
                            j2 = j3;
                            strV3 = mfrVar3.v(charsetA);
                            i3 = 0;
                        }
                        mfrVar = mfrVar2;
                        j = j2;
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        int i5 = 0;
                        while (true) {
                            if (i5 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = (String) arrayList2.get(i5);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        long j4 = nvmVar.b;
                        if (j4 == j || jE2 >= j4) {
                            meoVar.a(new nut(ekgb.r(f(spannedFromHtml, str)), jE, jE2 - jE));
                        } else if (arrayList != null) {
                            arrayList.add(new nut(ekgb.r(f(spannedFromHtml, str)), jE, jE2 - jE));
                        }
                    } else {
                        mfrVar = mfrVar2;
                        j = j2;
                        mff.f("SubripParser", "Skipping invalid timing: ".concat(strV2));
                    }
                } catch (NumberFormatException unused) {
                    mfrVar = mfrVar2;
                    j = j2;
                    mff.f("SubripParser", "Skipping invalid index: ".concat(strV));
                }
            } else {
                mfrVar = mfrVar2;
                j = j2;
            }
            nwuVar = this;
            j2 = j;
            mfrVar2 = mfrVar;
        }
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                meoVar.a((nut) arrayList.get(i6));
            }
        }
    }

    @Override // defpackage.nvn
    public final /* synthetic */ void c() {
    }
}
