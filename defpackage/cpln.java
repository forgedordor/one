package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.text.ParseException;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cpln {
    final /* synthetic */ cplo a;

    public cpln(cplo cploVar) {
        this.a = cploVar;
    }

    public final void a(StreamTokenizer streamTokenizer, Reader reader, femm femmVar) throws IOException, femo {
        int i;
        boolean z;
        String str = streamTokenizer.sval;
        cple cpleVar = (cple) femmVar;
        feou feouVarA = cpleVar.b.a(ejuf.d(str));
        cplf cplfVar = cpleVar.d;
        cplfVar.i = feouVarA;
        while (cplo.b(streamTokenizer, reader) == 59) {
            cplo cploVar = this.a.f.a;
            cplo.f(streamTokenizer, reader, -3);
            String str2 = streamTokenizer.sval;
            cplo.f(streamTokenizer, reader, 61);
            StringBuilder sb = new StringBuilder();
            if (cplo.b(streamTokenizer, reader) == 34) {
                sb.append(String.format("\"%s\"", streamTokenizer.sval));
            } else if (streamTokenizer.sval != null) {
                sb.append(streamTokenizer.sval);
                while (true) {
                    int iB = cplo.b(streamTokenizer, reader);
                    if (iB == 59 || iB == 58 || iB == 44) {
                        break;
                    } else {
                        cplo.d(streamTokenizer, sb);
                    }
                }
                streamTokenizer.pushBack();
            } else if (streamTokenizer.sval == null) {
                streamTokenizer.pushBack();
            }
            try {
                String string = sb.toString();
                try {
                    cplf.a(cplfVar.i);
                    feno fenoVarA = ((cple) femmVar).c.a(ejuf.d(str2), fexb.b(string));
                    feou feouVar = cplfVar.i;
                    feouVar.getClass();
                    feouVar.b.c(fenoVarA);
                } catch (RuntimeException e) {
                    feou feouVar2 = ((cple) femmVar).d.i;
                    feouVar2.getClass();
                    if (!feouVar2.a.startsWith("X-")) {
                        throw e;
                    }
                }
            } catch (ClassCastException e2) {
                throw new femo("Error parsing parameter", cplo.a(streamTokenizer, reader), e2);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        streamTokenizer.ordinaryChar(34);
        while (cplo.b(streamTokenizer, reader) != 10) {
            cplo.d(streamTokenizer, sb2);
        }
        streamTokenizer.quoteChar(34);
        try {
            if ("RRULE".equals(str)) {
                String string2 = sb2.toString();
                Matcher matcher = cpli.a.matcher(string2.trim());
                if (matcher.matches()) {
                    StringBuilder sb3 = new StringBuilder();
                    String strD = ejuf.d(matcher.group(1));
                    String strGroup = matcher.group(2);
                    String strD2 = ejuf.d(matcher.group(3).trim());
                    String strGroup2 = matcher.group(4);
                    String strGroup3 = matcher.group(5);
                    char cCharAt = strD.charAt(0);
                    if (cCharAt == 'D') {
                        i = 4;
                    } else if (cCharAt == 'M') {
                        i = 6;
                    } else if (cCharAt == 'W') {
                        i = 5;
                    } else {
                        if (cCharAt != 'Y') {
                            throw new AssertionError();
                        }
                        i = 7;
                    }
                    sb3.append("FREQ=");
                    sb3.append(i != 4 ? i != 5 ? i != 6 ? "YEARLY" : "MONTHLY" : "WEEKLY" : "DAILY");
                    if (strGroup != null && !strGroup.isEmpty() && !"1".equals(strGroup)) {
                        sb3.append(";INTERVAL=");
                        sb3.append(strGroup);
                    }
                    if (strD2 != null && !strD2.isEmpty()) {
                        String[] strArrSplit = cpli.b.split(strD2);
                        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                            String str3 = strArrSplit[i2];
                            char cCharAt2 = str3.charAt(str3.length() - 1);
                            if (cCharAt2 == '+') {
                                strArrSplit[i2] = str3.substring(0, str3.length() - 1);
                            } else if (cCharAt2 == '-') {
                                strArrSplit[i2] = cCharAt2 + str3.substring(0, str3.length() - 1);
                            }
                            if (str3.equals("LD")) {
                                strArrSplit[i2] = "-1";
                            }
                        }
                        int i3 = i - 1;
                        if (i3 == 4) {
                            sb3.append(";BYDAY=");
                            cpli.a(sb3, strArrSplit);
                        } else if (i3 != 5) {
                            if (i3 == 6) {
                                String str4 = ";BYYEARDAY=";
                                if (strD.charAt(1) != 'D') {
                                    str4 = ";BYMONTH=";
                                }
                                sb3.append(str4);
                                cpli.a(sb3, strArrSplit);
                            }
                        } else if (strD.charAt(1) == 'P') {
                            sb3.append(";BYDAY=");
                            int i4 = 0;
                            boolean z2 = false;
                            for (int i5 = 0; i5 < strArrSplit.length; i5++) {
                                if (Character.isLetter(strArrSplit[i5].charAt(0))) {
                                    if (i5 > i4) {
                                        while (i4 < i5) {
                                            if (z2) {
                                                sb3.append(",");
                                            }
                                            sb3.append(strArrSplit[i4]);
                                            sb3.append(strArrSplit[i5]);
                                            i4++;
                                            z2 = true;
                                        }
                                        z = z2;
                                    } else {
                                        if (z2) {
                                            sb3.append(",");
                                        }
                                        sb3.append(strArrSplit[i5]);
                                        z = true;
                                    }
                                    z2 = z;
                                    i4 = i5 + 1;
                                }
                            }
                        } else {
                            sb3.append(";BYMONTHDAY=");
                            cpli.a(sb3, strArrSplit);
                        }
                    }
                    if (strGroup2 != null) {
                        if (!"0".equals(strGroup2)) {
                            sb3.append(";COUNT=");
                            sb3.append(strGroup2);
                        }
                    } else if (strGroup3 != null) {
                        String strD3 = ejuf.d(strGroup3);
                        sb3.append(";UNTIL=");
                        sb3.append(strD3);
                        if (!strD3.endsWith("Z") && strD3.contains("T")) {
                            sb3.append("Z");
                        }
                    }
                    string2 = sb3.toString();
                }
                femmVar.a(string2);
            } else {
                femmVar.a(sb2.toString());
            }
            cplf cplfVar2 = cpleVar.d;
            cplf.a(cplfVar2.i);
            feou feouVar3 = cplfVar2.i;
            feouVar3.getClass();
            cplfVar2.i = fewt.a(feouVar3);
            feou feouVar4 = cplfVar2.i;
            feouVar4.getClass();
            femz femzVar = cplfVar2.g;
            if (femzVar != null) {
                femz femzVar2 = cplfVar2.h;
                if (femzVar2 != null) {
                    femzVar2.b.add(feouVar4);
                } else {
                    femzVar.b.add(feouVar4);
                }
            } else {
                fems femsVar = cplfVar2.f;
                if (femsVar != null) {
                    femsVar.a.add(feouVar4);
                }
            }
            cplfVar2.i = null;
        } catch (IllegalArgumentException | ParseException e3) {
            ekrw ekrwVarI = cplo.a.i();
            ekrwVarI.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e3)).h("com/google/android/apps/messaging/shared/util/calendar/VCalendarParser$PropertyParser", "parse", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "VCalendarParser.java")).D("[%s] %s", str, e3.getMessage());
        }
    }
}
