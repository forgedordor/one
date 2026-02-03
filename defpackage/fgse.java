package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgse extends fgsy {
    static final String[] a = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
    static final String[] b = {"ol", "ul"};
    static final String[] c = {"button"};
    static final String[] d = {"html", "table"};
    static final String[] e = {"optgroup", "option"};
    static final String[] f = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};
    static final String[] g = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
    static final String[] h = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.HEADER, "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE, "tr", "ul", "wbr", "xmp"};
    private final String[] D = {null};
    public fgsg i;
    public fgsg j;
    public boolean k;
    public fgrs l;
    public fgrv m;
    public ArrayList n;
    public ArrayList o;
    public List p;
    public fgsr q;
    public boolean r;
    public boolean s;

    public static boolean M(ArrayList arrayList, fgrs fgrsVar) {
        int size = arrayList.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            if (((fgrs) arrayList.get(i)) == fgrsVar) {
                return true;
            }
            i--;
        }
        return false;
    }

    static final boolean S(fgrs fgrsVar) {
        return fgre.g(fgrsVar.n(), h);
    }

    public static final void Y(ArrayList arrayList, fgrs fgrsVar, fgrs fgrsVar2) {
        int iLastIndexOf = arrayList.lastIndexOf(fgrsVar);
        fgqz.c(iLastIndexOf != -1);
        arrayList.set(iLastIndexOf, fgrsVar2);
    }

    private final void ae(String... strArr) {
        int size = this.x.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            fgrs fgrsVar = (fgrs) this.x.get(size);
            String strN = fgrsVar.n();
            String[] strArr2 = fgre.a;
            for (String str : strArr) {
                if (str.equals(strN)) {
                    return;
                }
            }
            if (fgrsVar.n().equals("html")) {
                return;
            } else {
                this.x.remove(size);
            }
        }
    }

    private final boolean af(String str, String[] strArr, String[] strArr2) {
        String[] strArr3 = this.D;
        strArr3[0] = str;
        return I(strArr3, strArr, strArr2);
    }

    private final void ag(fgry fgryVar) {
        fgrv fgrvVar;
        if (this.x.isEmpty()) {
            this.w.K(fgryVar);
        } else if (this.s && fgre.g(Z().n(), fgsf.A)) {
            t(fgryVar);
        } else {
            Z().K(fgryVar);
        }
        if (fgryVar instanceof fgrs) {
            fgrs fgrsVar = (fgrs) fgryVar;
            if (!fgrsVar.e.i || (fgrvVar = this.m) == null) {
                return;
            }
            fgrvVar.a.add(fgrsVar);
        }
    }

    final void A(fgrs fgrsVar, int i) {
        h(fgrsVar);
        try {
            this.n.add(i, fgrsVar);
        } catch (IndexOutOfBoundsException unused) {
            this.n.add(fgrsVar);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0052 -> B:23:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void B() {
        /*
            r8 = this;
            java.util.ArrayList r0 = r8.x
            int r0 = r0.size()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 <= r1) goto Lc
            goto L84
        Lc:
            java.util.ArrayList r0 = r8.n
            int r0 = r0.size()
            r1 = 0
            if (r0 <= 0) goto L24
            java.util.ArrayList r0 = r8.n
            int r2 = r0.size()
            int r2 = r2 + (-1)
            java.lang.Object r0 = r0.get(r2)
            fgrs r0 = (defpackage.fgrs) r0
            goto L25
        L24:
            r0 = r1
        L25:
            if (r0 == 0) goto L84
            boolean r2 = r8.L(r0)
            if (r2 != 0) goto L84
            java.util.ArrayList r2 = r8.n
            int r2 = r2.size()
            int r3 = r2 + (-12)
            r4 = 0
            if (r3 >= 0) goto L39
            r3 = r4
        L39:
            int r2 = r2 + (-1)
            r5 = r2
        L3c:
            if (r5 != r3) goto L40
            r3 = 1
            goto L53
        L40:
            java.util.ArrayList r0 = r8.n
            int r5 = r5 + (-1)
            java.lang.Object r0 = r0.get(r5)
            fgrs r0 = (defpackage.fgrs) r0
            if (r0 == 0) goto L52
            boolean r6 = r8.L(r0)
            if (r6 == 0) goto L3c
        L52:
            r3 = r4
        L53:
            if (r3 != 0) goto L5f
            java.util.ArrayList r0 = r8.n
            int r5 = r5 + 1
            java.lang.Object r0 = r0.get(r5)
            fgrs r0 = (defpackage.fgrs) r0
        L5f:
            defpackage.fgqz.g(r0)
            fgrs r3 = new fgrs
            java.lang.String r6 = r0.n()
            fgsj r7 = r8.A
            fgsl r6 = r8.aa(r6, r7)
            fgrh r7 = r0.v()
            fgrh r7 = r7.clone()
            r3.<init>(r6, r1, r7)
            r8.q(r3)
            java.util.ArrayList r6 = r8.n
            r6.set(r5, r3)
            if (r5 == r2) goto L84
            goto L52
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgse.B():void");
    }

    final void C(fgrs fgrsVar) {
        int size = this.n.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (((fgrs) this.n.get(size)) != fgrsVar);
        this.n.remove(size);
    }

    final void D() {
        fgrs fgrsVarW;
        if (!K("body")) {
            ArrayList arrayList = this.x;
            fgrs fgrsVarJ = this.w.j();
            Iterator it = fgrsVarJ.t().iterator();
            while (true) {
                if (!it.hasNext()) {
                    fgrsVarW = fgrsVarJ.w("body");
                    break;
                }
                fgrsVarW = (fgrs) it.next();
                if ("body".equals(fgrsVarW.n()) || "frameset".equals(fgrsVarW.n())) {
                    break;
                }
            }
            arrayList.add(fgrsVarW);
        }
        this.i = fgsg.InBody;
    }

    final boolean E(String str) {
        return G(str, c);
    }

    final boolean F(String str) {
        return G(str, null);
    }

    final boolean G(String str, String[] strArr) {
        return af(str, a, strArr);
    }

    final boolean H(String str) {
        String strN;
        int size = this.x.size();
        do {
            size--;
            if (size < 0) {
                fgqz.a("Should not be reachable");
                return false;
            }
            strN = ((fgrs) this.x.get(size)).n();
            if (strN.equals(str)) {
                return true;
            }
        } while (fgre.g(strN, e));
        return false;
    }

    public final boolean I(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.x.size();
        int i = size - 1;
        int i2 = i > 100 ? size + NetError.ERR_CONNECTION_RESET : 0;
        while (i >= i2) {
            String strN = ((fgrs) this.x.get(i)).n();
            if (fgre.g(strN, strArr)) {
                return true;
            }
            if (fgre.g(strN, strArr2)) {
                return false;
            }
            if (strArr3 != null && fgre.g(strN, strArr3)) {
                return false;
            }
            i--;
        }
        return false;
    }

    final boolean J(String str) {
        return af(str, d, null);
    }

    final boolean K(String str) {
        return e(str) != null;
    }

    final boolean L(fgrs fgrsVar) {
        return M(this.x, fgrsVar);
    }

    @Override // defpackage.fgsy
    public final boolean N(fgsu fgsuVar) {
        this.z = fgsuVar;
        return this.i.a(fgsuVar, this);
    }

    final boolean O(fgsu fgsuVar, fgsg fgsgVar) {
        this.z = fgsuVar;
        return fgsgVar.a(fgsuVar, this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x003c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0140 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0141 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean P() {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgse.P():boolean");
    }

    final void Q() {
        o("p");
        if (!"p".equals(Z().n())) {
            m(this.i);
        }
        V("p");
    }

    final void R(fgss fgssVar, boolean z, boolean z2) {
        fgsl fgslVarAa = aa(fgssVar.d(), this.A);
        fgsj fgsjVar = this.A;
        fgrh fgrhVar = fgssVar.g;
        fgsjVar.c(fgrhVar);
        fgrv fgrvVar = new fgrv(fgslVarAa, fgrhVar);
        if (!z2 || !K("template")) {
            this.m = fgrvVar;
        }
        ag(fgrvVar);
        if (z) {
            this.x.add(fgrvVar);
        }
    }

    final void T() {
    }

    final void U() {
        int size = this.x.size();
        while (true) {
            size--;
            if (size < 0 || ((fgrs) this.x.get(size)).n().equals("ruby")) {
                return;
            } else {
                this.x.remove(size);
            }
        }
    }

    final void V(String str) {
        fgrs fgrsVar;
        int size = this.x.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
            fgrsVar = (fgrs) this.x.get(size);
            this.x.remove(size);
        } while (!fgrsVar.n().equals(str));
    }

    final void W() {
        if (this.o.size() > 0) {
        }
    }

    final void X(fgrs fgrsVar) {
        int size = this.x.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (((fgrs) this.x.get(size)) != fgrsVar);
        this.x.remove(size);
    }

    final int a(fgrs fgrsVar) {
        for (int i = 0; i < this.n.size(); i++) {
            if (fgrsVar == this.n.get(i)) {
                return i;
            }
        }
        return -1;
    }

    final int b() {
        return this.o.size();
    }

    final fgrs c(fgrs fgrsVar) {
        int size = this.x.size() - 1;
        while (size >= 0) {
            int i = size - 1;
            if (((fgrs) this.x.get(size)) == fgrsVar) {
                return (fgrs) this.x.get(i);
            }
            size = i;
        }
        return null;
    }

    final fgrs d(String str) {
        fgrs fgrsVar;
        int size = this.n.size();
        do {
            size--;
            if (size < 0 || (fgrsVar = (fgrs) this.n.get(size)) == null) {
                return null;
            }
        } while (!fgrsVar.n().equals(str));
        return fgrsVar;
    }

    final fgrs e(String str) {
        int size = this.x.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            fgrs fgrsVar = (fgrs) this.x.get(i);
            if (fgrsVar.n().equals(str)) {
                return fgrsVar;
            }
            i--;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.fgrs f(defpackage.fgss r11) {
        /*
            r10 = this;
            boolean r0 = r11.p()
            if (r0 == 0) goto L6d
            fgrh r0 = r11.g
            boolean r0 = r0.n()
            if (r0 != 0) goto L6d
            fgrh r0 = r11.g
            fgsj r1 = r10.A
            boolean r2 = r0.n()
            if (r2 == 0) goto L19
            goto L6d
        L19:
            boolean r1 = r1.d
            r2 = 0
            r3 = r2
            r4 = r3
        L1e:
            java.lang.String[] r5 = r0.b
            int r5 = r5.length
            r6 = 1
            if (r3 >= r5) goto L4f
            int r5 = r3 + 1
            r7 = r5
        L27:
            java.lang.String[] r8 = r0.b
            int r9 = r8.length
            if (r7 >= r9) goto L4d
            r9 = r8[r7]
            if (r9 != 0) goto L31
            goto L4d
        L31:
            if (r1 == 0) goto L3c
            r8 = r8[r3]
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L4b
            goto L44
        L3c:
            r8 = r8[r3]
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L4b
        L44:
            int r4 = r4 + 1
            r0.k(r7)
            int r7 = r7 + (-1)
        L4b:
            int r7 = r7 + r6
            goto L27
        L4d:
            r3 = r5
            goto L1e
        L4f:
            if (r4 <= 0) goto L6d
            java.lang.String r0 = r11.b
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r2] = r0
            fgsk r0 = r10.t
            fgsi r0 = r0.b
            boolean r2 = r0.a()
            if (r2 == 0) goto L6d
            fgsh r2 = new fgsh
            fgsd r3 = r10.u
            java.lang.String r4 = "Dropped duplicate attribute(s) in tag [%s]"
            r2.<init>(r3, r4, r1)
            r0.add(r2)
        L6d:
            boolean r0 = r11.f
            if (r0 == 0) goto L93
            fgrs r11 = r10.g(r11)
            java.util.ArrayList r0 = r10.x
            r0.add(r11)
            fgsw r0 = r10.v
            fgsx r1 = defpackage.fgsx.Data
            r0.q(r1)
            fgsw r0 = r10.v
            fgsr r1 = r10.q
            r1.a()
            java.lang.String r2 = r11.p()
            r1.q(r2)
            r0.j(r1)
            return r11
        L93:
            fgrs r0 = new fgrs
            java.lang.String r1 = r11.d()
            fgsj r2 = r10.A
            fgsl r1 = r10.aa(r1, r2)
            fgsj r2 = r10.A
            fgrh r11 = r11.g
            r2.c(r11)
            r2 = 0
            r0.<init>(r1, r2, r11)
            r10.ag(r0)
            java.util.ArrayList r11 = r10.x
            r11.add(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgse.f(fgss):fgrs");
    }

    final fgrs g(fgss fgssVar) {
        fgsl fgslVarAa = aa(fgssVar.d(), this.A);
        fgsj fgsjVar = this.A;
        fgrh fgrhVar = fgssVar.g;
        fgsjVar.c(fgrhVar);
        fgrs fgrsVar = new fgrs(fgslVarAa, null, fgrhVar);
        ag(fgrsVar);
        if (fgssVar.f) {
            if (!fgsl.a.containsKey(fgslVarAa.b)) {
                fgslVarAa.g = true;
            } else if (!fgslVarAa.f) {
                this.v.p("Tag [%s] cannot be self closing; not a void tag", fgslVarAa.c);
                return fgrsVar;
            }
        }
        return fgrsVar;
    }

    final void h(fgrs fgrsVar) {
        fgrs fgrsVar2;
        int size = this.n.size();
        int i = size - 1;
        int i2 = 0;
        while (true) {
            int i3 = size - 13;
            if (i3 < 0) {
                i3 = 0;
            }
            if (i < i3 || (fgrsVar2 = (fgrs) this.n.get(i)) == null) {
                return;
            }
            if (fgrsVar.n().equals(fgrsVar2.n()) && fgrsVar.v().equals(fgrsVar2.v())) {
                i2++;
            }
            if (i2 == 3) {
                this.n.remove(i);
                return;
            }
            i--;
        }
    }

    final void i() {
        while (!this.n.isEmpty()) {
            int size = this.n.size();
            if ((size > 0 ? (fgrs) this.n.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    final void j() {
        ae("tbody", "tfoot", "thead", "template");
    }

    final void k() {
        ae("table", "template");
    }

    final void l() {
        ae("tr", "template");
    }

    final void m(fgsg fgsgVar) {
        if (this.t.b.a()) {
            this.t.b.add(new fgsh(this.u, "Unexpected %s token [%s] when in state [%s]", this.z.getClass().getSimpleName(), this.z, fgsgVar));
        }
    }

    final void n() {
        p(false);
    }

    final void o(String str) {
        while (fgre.g(Z().n(), f)) {
            if (str != null && ab(str)) {
                return;
            } else {
                T();
            }
        }
    }

    final void p(boolean z) {
        String[] strArr = z ? g : f;
        while (fgre.g(Z().n(), strArr)) {
            T();
        }
    }

    final void q(fgrs fgrsVar) {
        ag(fgrsVar);
        this.x.add(fgrsVar);
    }

    final void r(fgsn fgsnVar) {
        fgrs fgrsVarZ = Z();
        String strN = fgrsVarZ.n();
        boolean z = fgsnVar instanceof fgsm;
        String str = fgsnVar.a;
        fgrsVarZ.K(z ? new fgri(str) : (strN.equals("script") || strN.equals("style")) ? new fgrk(str) : new fgsb(str));
    }

    final void s(fgso fgsoVar) {
        ag(new fgrj(fgsoVar.b()));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void t(defpackage.fgry r6) {
        /*
            r5 = this;
            java.lang.String r0 = "table"
            fgrs r0 = r5.e(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1b
            fgrs r3 = r0.A()
            if (r3 == 0) goto L16
            fgrs r3 = r0.A()
            r4 = r1
            goto L24
        L16:
            fgrs r3 = r5.c(r0)
            goto L23
        L1b:
            java.util.ArrayList r3 = r5.x
            java.lang.Object r3 = r3.get(r2)
            fgrs r3 = (defpackage.fgrs) r3
        L23:
            r4 = r2
        L24:
            if (r4 == 0) goto L3a
            defpackage.fgqz.g(r0)
            fgry r3 = r0.k
            defpackage.fgqz.g(r3)
            fgry r3 = r0.k
            int r0 = r0.l
            fgry[] r1 = new defpackage.fgry[r1]
            r1[r2] = r6
            r3.R(r0, r1)
            return
        L3a:
            r3.K(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgse.t(fgry):void");
    }

    public final String toString() {
        return "TreeBuilder{currentToken=" + String.valueOf(this.z) + ", state=" + String.valueOf(this.i) + ", currentElement=" + String.valueOf(Z()) + "}";
    }

    final void u() {
        this.n.add(null);
    }

    final void v() {
        this.j = this.i;
    }

    final void w() {
        this.p = new ArrayList();
    }

    final void x(String... strArr) {
        fgrs fgrsVar;
        int size = this.x.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
            fgrsVar = (fgrs) this.x.get(size);
            this.x.remove(size);
        } while (!fgre.g(fgrsVar.n(), strArr));
    }

    final void y(fgrs fgrsVar) {
        h(fgrsVar);
        this.n.add(fgrsVar);
    }

    final void z(fgsg fgsgVar) {
        this.o.add(fgsgVar);
    }
}
