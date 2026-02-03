package defpackage;

import j$.util.DesugarCollections;
import j$.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgin implements fgml {
    public static final Set a;
    public static final Map b;
    public fgly c;
    public boolean h;
    public final List i;
    public final List j;
    public final List k;
    public final Set l;
    public final fgik m;
    private boolean r;
    private final List t;
    private int q = -1;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    private int s = 0;
    public int g = 0;
    public final fgii n = new fgii();
    public final List o = new ArrayList();
    public final List p = new ArrayList();

    static {
        Object[] objArr = {fgkl.class, fgkv.class, fgkt.class, fgkw.class, fglp.class, fglc.class, fgkz.class};
        ArrayList arrayList = new ArrayList(7);
        for (int i = 0; i < 7; i++) {
            Object obj = objArr[i];
            obj.getClass();
            arrayList.add(obj);
        }
        a = new LinkedHashSet(DesugarCollections.unmodifiableList(arrayList));
        HashMap map = new HashMap();
        map.put(fgkl.class, new fgie());
        map.put(fgkv.class, new fgiq());
        map.put(fgkt.class, new fgio());
        map.put(fgkw.class, new fgis());
        map.put(fglp.class, new fgjn());
        map.put(fglc.class, new fgjg());
        map.put(fgkz.class, new fgiu());
        b = DesugarCollections.unmodifiableMap(map);
    }

    public fgin(List list, List list2, List list3, List list4, Set set) {
        this.t = list;
        this.i = list2;
        this.j = list3;
        this.k = list4;
        this.l = set;
        fgik fgikVar = new fgik();
        this.m = fgikVar;
        e(new fgim(fgikVar, 0));
    }

    private final fgim d() {
        return (fgim) this.o.remove(r0.size() - 1);
    }

    private final void e(fgim fgimVar) {
        this.o.add(fgimVar);
    }

    private final void f(fgim fgimVar) {
        while (true) {
            fgmi fgmiVarA = a();
            fgmi fgmiVar = fgimVar.a;
            if (fgmiVarA.k(fgmiVar.b())) {
                a().b().h(fgmiVar.b());
                e(fgimVar);
                return;
            }
            b(1);
        }
    }

    private final void g(fgmi fgmiVar) {
        for (fgkq fgkqVar : fgmiVar.m()) {
            fgii fgiiVar = this.n;
            Class cls = fgkqVar.a;
            fgkq fgkqVarA = fgiiVar.a(cls);
            if (fgkqVarA == null) {
                fgiiVar.a.put(cls, fgkqVar);
            } else {
                for (Map.Entry entry : fgkqVar.b.entrySet()) {
                    Map.EL.putIfAbsent(fgkqVarA.b, (String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    private final void h() {
        CharSequence charSequenceSubSequence;
        if (this.r) {
            int i = this.d + 1;
            CharSequence charSequence = this.c.a;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i, charSequence.length());
            int iA = fgki.a(this.e);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + iA);
            for (int i2 = 0; i2 < iA; i2++) {
                sb.append(' ');
            }
            sb.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb.toString();
        } else {
            int i3 = this.d;
            if (i3 == 0) {
                charSequenceSubSequence = this.c.a;
            } else {
                CharSequence charSequence2 = this.c.a;
                charSequenceSubSequence = charSequence2.subSequence(i3, charSequence2.length());
            }
        }
        a().d(new fgly(charSequenceSubSequence, null));
    }

    private final void i() {
        int iA;
        char cCharAt = this.c.a.charAt(this.d);
        this.d++;
        if (cCharAt == '\t') {
            int i = this.e;
            iA = i + fgki.a(i);
        } else {
            iA = this.e + 1;
        }
        this.e = iA;
    }

    private final void j() {
        int i = this.d;
        int i2 = this.e;
        this.h = true;
        int length = this.c.a.length();
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = this.c.a.charAt(i);
            if (cCharAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (cCharAt != ' ') {
                this.h = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.f = i;
        this.s = i2;
        this.g = i2 - this.e;
    }

    private final void k(int i) {
        int i2;
        boolean z;
        int i3 = this.s;
        if (i >= i3) {
            this.d = this.f;
            this.e = i3;
        }
        int length = this.c.a.length();
        while (true) {
            i2 = this.e;
            if (i2 >= i || this.d == length) {
                break;
            } else {
                i();
            }
        }
        if (i2 > i) {
            this.d--;
            this.e = i;
            z = true;
        } else {
            z = false;
        }
        this.r = z;
    }

    private final void l(int i) {
        int i2 = this.f;
        if (i >= i2) {
            this.d = i2;
            this.e = this.s;
        }
        int length = this.c.a.length();
        while (true) {
            int i3 = this.d;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                i();
            }
        }
        this.r = false;
    }

    @Override // defpackage.fgml
    public final fgmi a() {
        return ((fgim) this.o.get(r0.size() - 1)).a;
    }

    public final void b(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            fgmi fgmiVar = d().a;
            g(fgmiVar);
            fgmiVar.l();
            this.p.add(fgmiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        r14 = r5.size() - r2;
        r2 = ((defpackage.fgim) r5.get(r2 - 1)).a;
        r6 = r13.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if ((r2.b() instanceof defpackage.fglj) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (r2.g() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        if (r7 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        r6 = r13.d;
        j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        if (r13.h != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        if (r13.g >= 4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        if (java.lang.Character.isLetter(java.lang.Character.codePointAt(r13.c.a, r13.f)) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
    
        r7 = new defpackage.fgil(r2);
        r9 = r13.t.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
    
        if (r9.hasNext() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bd, code lost:
    
        r10 = ((defpackage.fgmj) r9.next()).a(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
    
        if ((r10 instanceof defpackage.fgig) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cc, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cd, code lost:
    
        if (r10 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cf, code lost:
    
        l(r13.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d6, code lost:
    
        r7 = r13.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d8, code lost:
    
        if (r14 <= 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
    
        b(r14);
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00de, code lost:
    
        r10 = (defpackage.fgig) r10;
        r8 = r10.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e2, code lost:
    
        if (r8 == (-1)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e4, code lost:
    
        l(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e8, code lost:
    
        r8 = r10.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ea, code lost:
    
        if (r8 == (-1)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ec, code lost:
    
        k(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f1, code lost:
    
        if (r10.d == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f3, code lost:
    
        r8 = d().a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fb, code lost:
    
        if ((r8 instanceof defpackage.fgjl) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fd, code lost:
    
        g((defpackage.fgjl) r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0103, code lost:
    
        r8.l();
        r8.b().k();
        r8 = r8.b().f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0116, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0117, code lost:
    
        r9 = r10.a;
        r11 = 0;
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011c, code lost:
    
        if (r11 >= r9.length) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011e, code lost:
    
        r2 = r9[r11];
        f(new defpackage.fgim(r2, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0128, code lost:
    
        if (r8 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012a, code lost:
    
        r2.b().j(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0131, code lost:
    
        r10 = r2.g();
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0138, code lost:
    
        r8 = true;
        r7 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013c, code lost:
    
        l(r13.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0141, code lost:
    
        if (r8 != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0145, code lost:
    
        if (r13.h != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014f, code lost:
    
        if (a().f() != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0152, code lost:
    
        ((defpackage.fgim) r5.get(r5.size() - 1)).b = r6;
        h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0162, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0163, code lost:
    
        if (r14 <= 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0165, code lost:
    
        b(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016c, code lost:
    
        if (r2.g() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0170, code lost:
    
        if (r13.h != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0172, code lost:
    
        f(new defpackage.fgim(new defpackage.fgjl(), r6));
        h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0182, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0183, code lost:
    
        h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0186, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgin.c(java.lang.String):void");
    }
}
