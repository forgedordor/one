package defpackage;

import android.util.Log;
import androidx.car.app.model.Alert;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awch {
    private final ekgb d;
    private final ekgb e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final avoi j;
    private final LinkedList k;
    private final HashMap l = new HashMap();
    private static final ekhx b = ekhx.v(' ', '@', '.', ',', ':', '-', '(', ')', '+', '[', ']', '{', '}', '<', '>');
    private static final ekhx c = ekhx.t("ʼWAP_PUSH_SI!ʼ", "ʼUNKNOWN_SENDER!ʼ", "EMERGENCY+SERVICE+PROVIDER", "EMERGENCY+SERVICE+PROVIDER+DEMO");
    static final cczi a = cdag.e(cdag.b, "bcm_number_of_digits_to_anonymize", Alert.DURATION_SHOW_INDEFINITELY);

    public awch(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, Function function, fcsu fcsuVar4, fcsu fcsuVar5, avoj avojVar, String str) {
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.i = fcsuVar3;
        this.f = fcsuVar4;
        if (((dfld) fcsuVar5.b()).a()) {
            ekhx ekhxVar = b;
            Function functionM178m = aky$$ExternalSyntheticApiModelOutline0.m178m(avojVar.a.b());
            functionM178m.getClass();
            ekhxVar.getClass();
            this.j = new avoi(functionM178m, str, ekhxVar);
            int i = ekgb.d;
            ekgb ekgbVar = ekoe.a;
            this.d = ekgbVar;
            this.k = new LinkedList();
            this.e = ekgbVar;
            return;
        }
        Random random = (Random) function.apply(str);
        this.j = null;
        ArrayList arrayListC = ekjz.c('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K');
        Collections.shuffle(arrayListC, random);
        this.d = ekgb.n(arrayListC);
        ArrayList arrayListC2 = ekjz.c('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'y', 'z');
        Collections.shuffle(arrayListC2, random);
        this.k = new LinkedList(arrayListC2);
        ArrayList arrayListC3 = ekjz.c('L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V');
        Collections.shuffle(arrayListC3, random);
        this.e = ekgb.n(arrayListC3);
    }

    private final Character e() {
        LinkedList linkedList = this.k;
        char cCharValue = '?';
        if (!linkedList.isEmpty()) {
            try {
                Character ch = (Character) linkedList.removeFirst();
                if (ch != null) {
                    cCharValue = ch.charValue();
                }
                return Character.valueOf(cCharValue);
            } catch (NoSuchElementException unused) {
            }
        }
        return '?';
    }

    private final String f(String str) {
        StringBuilder sb = new StringBuilder();
        g(str, sb, 0);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g(java.lang.String r5, java.lang.StringBuilder r6, int r7) {
        /*
            r4 = this;
            r0 = 64
            int r0 = r5.indexOf(r0, r7)
            r1 = -1
            if (r0 != r1) goto L52
            cczi r0 = defpackage.awch.a
            java.lang.Object r0 = r0.e()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2 = 7
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r5.length()
            int r2 = r2 + r1
        L1f:
            if (r2 < r7) goto L44
            if (r0 <= 0) goto L44
            char r1 = r5.charAt(r2)
            boolean r3 = java.lang.Character.isWhitespace(r1)
            if (r3 != 0) goto L41
            boolean r3 = defpackage.avoi.b(r1)
            if (r3 != 0) goto L41
            ekhx r3 = defpackage.awch.b
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L41
            int r0 = r0 + (-1)
        L41:
            int r2 = r2 + (-1)
            goto L1f
        L44:
            int r2 = r2 + 1
        L46:
            if (r7 >= r2) goto L52
            char r0 = r5.charAt(r7)
            r6.append(r0)
            int r7 = r7 + 1
            goto L46
        L52:
            int r0 = r5.length()
            if (r7 >= r0) goto Lc3
            char r0 = r5.charAt(r7)
            avoi r1 = r4.j
            if (r1 == 0) goto L68
            char r0 = r1.a(r0)
            r6.append(r0)
            goto Lc0
        L68:
            boolean r1 = java.lang.Character.isDigit(r0)
            if (r1 == 0) goto L89
            r1 = 10
            int r1 = java.lang.Character.digit(r0, r1)
            r2 = 48
            if (r0 < r2) goto L7f
            r2 = 57
            if (r0 > r2) goto L7f
            ekgb r0 = r4.d
            goto L81
        L7f:
            ekgb r0 = r4.e
        L81:
            java.lang.Object r0 = r0.get(r1)
            r6.append(r0)
            goto Lc0
        L89:
            boolean r1 = java.lang.Character.isWhitespace(r0)
            if (r1 != 0) goto Lbd
            boolean r1 = defpackage.avoi.b(r0)
            if (r1 == 0) goto L96
            goto Lbd
        L96:
            ekhx r1 = defpackage.awch.b
            java.lang.Character r2 = java.lang.Character.valueOf(r0)
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto Lbd
            java.util.HashMap r0 = r4.l
            boolean r1 = r0.containsKey(r2)
            if (r1 == 0) goto Lb2
            java.lang.Object r0 = r0.get(r2)
            r6.append(r0)
            goto Lc0
        Lb2:
            java.lang.Character r1 = r4.e()
            r0.put(r2, r1)
            r6.append(r1)
            goto Lc0
        Lbd:
            r6.append(r0)
        Lc0:
            int r7 = r7 + 1
            goto L52
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awch.g(java.lang.String, java.lang.StringBuilder, int):void");
    }

    public final awcf a(String str) {
        ephf ephfVarN;
        ciur ciurVarA;
        String strValueOf;
        int iIndexOf;
        String strB = ((crnb) this.g.b()).b();
        if (str == null) {
            str = "";
        }
        avoh avohVar = null;
        try {
            ephfVarN = ((ephj) this.f.b()).n(str.trim().trim(), strB);
        } catch (ephe unused) {
            ephfVarN = null;
        }
        StringBuilder sb = new StringBuilder();
        boolean zContains = c.contains(str);
        int length = 0;
        if (ephfVarN != null) {
            boolean z = (!ephfVarN.f() || ephfVarN.g() == 1 || ephfVarN.g() == 5) ? false : true;
            if (z && (iIndexOf = str.indexOf((strValueOf = String.valueOf(ephfVarN.a())))) >= 0) {
                sb.append((CharSequence) str, 0, strValueOf.length() + iIndexOf);
                length = iIndexOf + strValueOf.length();
            }
            avohVar = new avoh(ephfVarN.e() ? Optional.of(new crnc(ephfVarN.a())) : Optional.empty(), z ? Optional.of(new crnc(ephfVarN.a())) : Optional.empty(), f(((ephj) this.f.b()).d(ephfVarN)));
        }
        g(str, sb, length);
        fcsu fcsuVar = this.h;
        if (((ciuw) fcsuVar.b()).b(str) && (ciurVarA = ((ciuw) fcsuVar.b()).a(str)) != null) {
            emue emueVar = (emue) emuf.a.createBuilder();
            String strF = f(((ciun) ciurVarA).c);
            emueVar.copyOnWrite();
            emuf emufVar = (emuf) emueVar.instance;
            emufVar.b |= 1;
            emufVar.c = strF;
            return new avog(strB, "", "", null, null, (emuf) emueVar.build());
        }
        fcsu fcsuVar2 = this.i;
        if (((chwl) fcsuVar2.b()).e(str)) {
            cmtu cmtuVarA = ((chwl) fcsuVar2.b()).a(str);
            Optional optionalEmpty = cmtuVarA == null ? Optional.empty() : b(cmtuVarA);
            if (optionalEmpty.isPresent()) {
                return new avog(strB, "", "", null, (emtz) optionalEmpty.get(), null);
            }
        }
        String string = sb.toString();
        if (!zContains) {
            str = f(str);
        }
        return new avog(strB, string, str, avohVar, null, null);
    }

    public final Optional b(cmtu cmtuVar) {
        emty emtyVar = (emty) emtz.a.createBuilder();
        String strF = f(cmtuVar.c);
        emtyVar.copyOnWrite();
        emtz emtzVar = (emtz) emtyVar.instance;
        emtzVar.b |= 1;
        emtzVar.c = strF;
        String str = cmtuVar.a;
        if (str != null) {
            String strF2 = f(str);
            emtyVar.copyOnWrite();
            emtz emtzVar2 = (emtz) emtyVar.instance;
            emtzVar2.b |= 4;
            emtzVar2.e = strF2;
        }
        String str2 = cmtuVar.b;
        if (str2 != null) {
            String strF3 = f(str2);
            emtyVar.copyOnWrite();
            emtz emtzVar3 = (emtz) emtyVar.instance;
            emtzVar3.b |= 2;
            emtzVar3.d = strF3;
        }
        return Optional.of((emtz) emtyVar.build());
    }

    public final String c(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        g(str, sb, 0);
        return sb.toString();
    }

    final String d(String str) {
        return Log.isLoggable("Bugle", 3) ? a.a(str, "raw-pii[", "]") : ((avog) a(str)).a;
    }
}
