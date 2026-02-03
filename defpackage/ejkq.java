package defpackage;

import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejkq {
    public static final Pattern a = Pattern.compile("hello");
    public ekgd b;
    public ekgd c;
    public final boolean d;
    public int e;
    private final int f;
    private Random g;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ejkq(defpackage.ejha r9, defpackage.ejly r10, java.lang.String r11, int r12) throws java.io.IOException {
        /*
            r8 = this;
            r8.<init>()
            ejha r0 = defpackage.ejha.a
            boolean r0 = r9.equals(r0)
            r1 = 1
            r2 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            if (r0 == 0) goto L13
            goto La1
        L13:
            java.io.InputStream r9 = r10.f(r9)     // Catch: java.lang.Exception -> La1
            if (r9 != 0) goto L1b
            goto La1
        L1b:
            ejjm r10 = defpackage.ejjm.a     // Catch: java.lang.Throwable -> L95
            evsn r10 = defpackage.evsn.parseFrom(r10, r9)     // Catch: java.lang.Throwable -> L95
            ejjm r10 = (defpackage.ejjm) r10     // Catch: java.lang.Throwable -> L95
            ekgc r0 = new ekgc     // Catch: java.lang.Throwable -> L95
            r0.<init>()     // Catch: java.lang.Throwable -> L95
            ekgc r4 = new ekgc     // Catch: java.lang.Throwable -> L95
            r4.<init>()     // Catch: java.lang.Throwable -> L95
            evtg r10 = r10.b     // Catch: java.lang.Throwable -> L95
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L95
        L33:
            boolean r5 = r10.hasNext()     // Catch: java.lang.Throwable -> L95
            if (r5 == 0) goto L80
            java.lang.Object r5 = r10.next()     // Catch: java.lang.Throwable -> L95
            ejjq r5 = (defpackage.ejjq) r5     // Catch: java.lang.Throwable -> L95
            evtg r6 = r5.h     // Catch: java.lang.Throwable -> L95
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L95
            if (r6 != 0) goto L52
            evtg r6 = r5.h     // Catch: java.lang.Throwable -> L95
            boolean r6 = r6.contains(r11)     // Catch: java.lang.Throwable -> L95
            if (r6 == 0) goto L50
            goto L52
        L50:
            r6 = r2
            goto L63
        L52:
            evtg r6 = r5.i     // Catch: java.lang.Throwable -> L95
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L95
            if (r6 != 0) goto L62
            evtg r6 = r5.i     // Catch: java.lang.Throwable -> L95
            boolean r6 = r6.contains(r11)     // Catch: java.lang.Throwable -> L95
            if (r6 != 0) goto L50
        L62:
            r6 = r1
        L63:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L95
            r7.getClass()     // Catch: java.lang.Throwable -> L95
            if (r6 == 0) goto L33
            boolean r6 = r5.g     // Catch: java.lang.Throwable -> L95
            if (r6 == 0) goto L7a
            java.lang.String r6 = r5.b     // Catch: java.lang.Throwable -> L95
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)     // Catch: java.lang.Throwable -> L95
            r0.b(r6, r5)     // Catch: java.lang.Throwable -> L95
            goto L33
        L7a:
            java.lang.String r6 = r5.b     // Catch: java.lang.Throwable -> L95
            r4.b(r6, r5)     // Catch: java.lang.Throwable -> L95
            goto L33
        L80:
            ekgd r10 = r0.a()     // Catch: java.lang.Throwable -> L95
            r8.c = r10     // Catch: java.lang.Throwable -> L95
            ekgd r10 = r4.a()     // Catch: java.lang.Throwable -> L95
            r8.b = r10     // Catch: java.lang.Throwable -> L95
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L95
            r9.close()     // Catch: java.lang.Exception -> La1
            r3 = r10
            goto La1
        L95:
            r10 = move-exception
            if (r9 == 0) goto La0
            r9.close()     // Catch: java.lang.Throwable -> L9c
            goto La0
        L9c:
            r9 = move-exception
            r10.addSuppressed(r9)     // Catch: java.lang.Exception -> La1
        La0:
            throw r10     // Catch: java.lang.Exception -> La1
        La1:
            boolean r9 = r3.booleanValue()
            r9 = r9 ^ r1
            r8.d = r9
            r8.f = r12
            java.util.Random r9 = new java.util.Random
            r9.<init>()
            r8.g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejkq.<init>(ejha, ejly, java.lang.String, int):void");
    }

    public static final List b(ezgi ezgiVar, Pattern pattern, ejjq ejjqVar) {
        int iA;
        String strReplaceAll;
        int i = ejjqVar.d;
        int iA2 = ejjp.a(i);
        if ((iA2 == 0 || iA2 != 5) && ((iA = ejjp.a(i)) == 0 || iA != 2)) {
            return ekgb.r(ezgiVar);
        }
        ezgg ezggVar = ezgiVar.e;
        if (ezggVar == null) {
            ezggVar = ezgg.b;
        }
        ezgf ezgfVar = (ezgf) ezggVar.toBuilder();
        ezal ezalVar = ezal.REWRITER;
        ezgfVar.copyOnWrite();
        ((ezgg) ezgfVar.instance).g = ezalVar.a();
        ezan ezanVarB = ezan.b(ejjqVar.f);
        if (ezanVarB == null) {
            ezanVarB = ezan.UNKNOWN_SUGGESTION_TYPE;
        }
        ezgfVar.copyOnWrite();
        ((ezgg) ezgfVar.instance).l = ezanVarB.a();
        ezgg ezggVar2 = (ezgg) ezgfVar.build();
        if (ejjqVar.g) {
            strReplaceAll = pattern.matcher((ezgiVar.c == 2 ? (ezgk) ezgiVar.d : ezgk.a).c).replaceAll(ejjqVar.c);
        } else {
            strReplaceAll = ejjqVar.c;
        }
        ezgi ezgiVar2 = ezgi.a;
        ezgh ezghVar = (ezgh) ezgiVar2.createBuilder(ezgiVar);
        ezghVar.copyOnWrite();
        ezgi ezgiVar3 = (ezgi) ezghVar.instance;
        ezggVar2.getClass();
        ezgiVar3.e = ezggVar2;
        ezgiVar3.b |= 1;
        ezghVar.copyOnWrite();
        ((ezgi) ezghVar.instance).f = ezaf.a(3);
        int i2 = ejjqVar.f;
        ezan ezanVarB2 = ezan.b(i2);
        if (ezanVarB2 == null) {
            ezanVarB2 = ezan.UNKNOWN_SUGGESTION_TYPE;
        }
        if (ezanVarB2 == ezan.GIF) {
            ezdb ezdbVar = (ezdb) ezdc.a.createBuilder();
            ezdbVar.copyOnWrite();
            ezdc ezdcVar = (ezdc) ezdbVar.instance;
            strReplaceAll.getClass();
            ezdcVar.b = strReplaceAll;
            ezghVar.copyOnWrite();
            ezgi ezgiVar4 = (ezgi) ezghVar.instance;
            ezdc ezdcVar2 = (ezdc) ezdbVar.build();
            ezdcVar2.getClass();
            ezgiVar4.d = ezdcVar2;
            ezgiVar4.c = 5;
        } else {
            ezan ezanVarB3 = ezan.b(i2);
            if (ezanVarB3 == null) {
                ezanVarB3 = ezan.UNKNOWN_SUGGESTION_TYPE;
            }
            if (ezanVarB3 == ezan.FULL_MESSAGE) {
                ezgj ezgjVar = (ezgj) ezgk.a.createBuilder();
                ezgjVar.copyOnWrite();
                ezgk ezgkVar = (ezgk) ezgjVar.instance;
                strReplaceAll.getClass();
                ezgkVar.c = strReplaceAll;
                ezghVar.copyOnWrite();
                ezgi ezgiVar5 = (ezgi) ezghVar.instance;
                ezgk ezgkVar2 = (ezgk) ezgjVar.build();
                ezgkVar2.getClass();
                ezgiVar5.d = ezgkVar2;
                ezgiVar5.c = 2;
            }
        }
        int iA3 = ejjp.a(ejjqVar.d);
        if (iA3 == 0 || iA3 != 2) {
            return ekgb.r((ezgi) ezghVar.build());
        }
        ezgh ezghVar2 = (ezgh) ezgiVar2.createBuilder(ezgiVar);
        ezghVar2.copyOnWrite();
        ((ezgi) ezghVar2.instance).f = ezaf.a(4);
        return ekgb.s((ezgi) ezghVar2.build(), (ezgi) ezghVar.build());
    }

    public final boolean a(float f) {
        return this.e < this.f && this.g.nextFloat() <= f;
    }
}
