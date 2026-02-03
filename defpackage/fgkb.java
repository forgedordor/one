package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgkb implements fgma {
    private static final fgmo a;
    private static final fgmo b;
    private static final fgmo c;
    private static final fgmo d;
    private static final fgmo e;
    private static final fgmo f;

    static {
        fgmn fgmnVarA = fgmo.a();
        fgmnVarA.b('A', 'Z');
        fgmnVarA.b('a', 'z');
        fgmo fgmoVar = new fgmo(fgmnVarA);
        a = fgmoVar;
        b = fgmoVar;
        fgmn fgmnVarB = fgmoVar.b();
        fgmnVarB.b('0', '9');
        fgmnVarB.a('-');
        c = new fgmo(fgmnVarB);
        fgmn fgmnVarB2 = fgmoVar.b();
        fgmnVarB2.a('_');
        fgmnVarB2.a(':');
        fgmo fgmoVar2 = new fgmo(fgmnVarB2);
        d = fgmoVar2;
        fgmn fgmnVarB3 = fgmoVar2.b();
        fgmnVarB3.b('0', '9');
        fgmnVarB3.a('.');
        fgmnVarB3.a('-');
        e = new fgmo(fgmnVarB3);
        fgmn fgmnVarA2 = fgmo.a();
        fgmnVarA2.a(' ');
        fgmnVarA2.a('\t');
        fgmnVarA2.a('\n');
        fgmnVarA2.a((char) 11);
        fgmnVarA2.a('\f');
        fgmnVarA2.a('\r');
        fgmnVarA2.a('\"');
        fgmnVarA2.a('\'');
        fgmnVarA2.a('=');
        fgmnVarA2.a('<');
        fgmnVarA2.a('>');
        fgmnVarA2.a('`');
        f = new fgmo(fgmnVarA2);
    }

    private static fgkd b(fgmd fgmdVar, fgme fgmeVar) {
        fgmeVar.e(fgmdVar, fgmeVar.f()).a();
        return new fgkd(new fgkx(), fgmeVar.f());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if (r9.m(defpackage.fgkb.d) <= 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        r9.m(defpackage.fgkb.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (r9.d() <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r9.k('=') == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        r9.d();
        r1 = r9.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r1 != '\'') goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        r9.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r9.b('\'') >= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        r9.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r1 != '\"') goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        r9.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r9.b('\"') < 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        r9.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        r1 = defpackage.fgkb.f;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        r7 = r9.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r7 == 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        if (r1.c(r7) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (r6 > 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
    
        if (r9.d() <= 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        r9.h();
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        r9.k('/');
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        if (r9.k('>') == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a6, code lost:
    
        return b(r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (r9.d() > 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r1 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0165, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x002e, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0090 -> B:6:0x002b). Please report as a decompilation issue!!! */
    @Override // defpackage.fgma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fgkd a(defpackage.fgmc r9) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgkb.a(fgmc):fgkd");
    }
}
