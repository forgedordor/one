package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fgsg {
    Initial,
    BeforeHtml,
    BeforeHead,
    InHead,
    InHeadNoscript,
    AfterHead,
    InBody,
    Text,
    InTable,
    InTableText,
    InCaption,
    InColumnGroup,
    InTableBody,
    InRow,
    InCell,
    InSelect,
    InSelectInTable,
    InTemplate,
    AfterBody,
    InFrameset,
    AfterFrameset,
    AfterAfterBody,
    AfterAfterFrameset,
    ForeignContent;

    private static final String y = "\u0000";

    private static final boolean A(fgsu fgsuVar, fgse fgseVar) {
        return fgseVar.O(fgsuVar, InTable);
    }

    private static final boolean B(fgsu fgsuVar, fgsy fgsyVar) {
        if (fgsyVar.ac("tr")) {
            return fgsyVar.N(fgsuVar);
        }
        return false;
    }

    private static final boolean C(fgsu fgsuVar, fgse fgseVar) {
        return fgseVar.O(fgsuVar, InBody);
    }

    private static final void D(fgse fgseVar) {
        if (fgseVar.J("td")) {
            fgseVar.ac("td");
        } else {
            fgseVar.ac("th");
        }
    }

    private static final boolean E(fgsu fgsuVar, fgse fgseVar) {
        fgseVar.q(new fgrs(fgseVar.aa("html", fgseVar.A), null));
        fgseVar.i = BeforeHead;
        return fgseVar.N(fgsuVar);
    }

    private static final boolean F(fgsu fgsuVar, fgsy fgsyVar) {
        fgsyVar.ac("head");
        return fgsyVar.N(fgsuVar);
    }

    private final void G(fgsu fgsuVar, fgse fgseVar) {
        fgseVar.m(this);
        fgsn fgsnVar = new fgsn();
        fgsnVar.a = fgsuVar.toString();
        fgseVar.r(fgsnVar);
    }

    private static final void H(fgsu fgsuVar, fgse fgseVar) {
        fgseVar.ad("body");
        fgseVar.r = true;
        fgseVar.N(fgsuVar);
    }

    static final boolean t(fgsu fgsuVar, fgse fgseVar) {
        if (w(fgsuVar)) {
            return true;
        }
        if (fgsuVar.t()) {
            fgseVar.s((fgso) fgsuVar);
            return true;
        }
        if (!fgsuVar.u()) {
            fgseVar.i = BeforeHtml;
            return fgseVar.N(fgsuVar);
        }
        fgsp fgspVar = (fgsp) fgsuVar;
        fgrn fgrnVar = new fgrn(fgseVar.A.b(fgspVar.b()), fgspVar.c.toString(), fgspVar.d.toString());
        fgrnVar.h(fgspVar.b);
        fgseVar.w.K(fgrnVar);
        if (fgspVar.e) {
            fgseVar.w.d = 2;
        }
        fgseVar.i = BeforeHtml;
        return true;
    }

    private static void v(fgss fgssVar, fgse fgseVar) {
        fgseVar.v.q(fgsx.Rawtext);
        fgseVar.v();
        fgseVar.i = Text;
        fgseVar.f(fgssVar);
    }

    private static boolean w(fgsu fgsuVar) {
        if (fgsuVar.s()) {
            return fgre.h(((fgsn) fgsuVar).a);
        }
        return false;
    }

    private final boolean x(fgsu fgsuVar, fgse fgseVar) {
        if (!fgseVar.ab("colgroup")) {
            fgseVar.m(this);
            return false;
        }
        fgseVar.T();
        fgseVar.i = InTable;
        fgseVar.N(fgsuVar);
        return true;
    }

    private final boolean y(fgsu fgsuVar, fgse fgseVar) {
        if (!fgseVar.J("tbody") && !fgseVar.J("thead") && !fgseVar.F("tfoot")) {
            fgseVar.m(this);
            return false;
        }
        fgseVar.j();
        fgseVar.ac(fgseVar.Z().n());
        return fgseVar.N(fgsuVar);
    }

    private static final boolean z(fgsu fgsuVar, fgse fgseVar) {
        return fgseVar.O(fgsuVar, InTable);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x02c4, code lost:
    
        switch(r19) {
            case 3273: goto L224;
            case 3274: goto L221;
            case 3275: goto L218;
            case 3276: goto L215;
            case 3277: goto L212;
            case 3278: goto L209;
            default: goto L260;
        };
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:954:0x04e2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16, types: [int] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r24v0, types: [fgse, fgsy] */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean a(defpackage.fgsu r23, defpackage.fgse r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 4184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgsg.a(fgsu, fgse):boolean");
    }

    final boolean b(fgsu fgsuVar, fgse fgseVar) {
        if (fgsuVar.u()) {
            fgseVar.m(this);
            return false;
        }
        if (fgsuVar.t()) {
            fgseVar.s((fgso) fgsuVar);
            return true;
        }
        if (w(fgsuVar)) {
            fgseVar.r((fgsn) fgsuVar);
            return true;
        }
        if (fgsuVar.x()) {
            fgss fgssVar = (fgss) fgsuVar;
            if (fgssVar.b.equals("html")) {
                fgseVar.f(fgssVar);
                fgseVar.i = BeforeHead;
                return true;
            }
        }
        if (fgsuVar.w() && fgre.g(((fgsr) fgsuVar).b, fgsf.e)) {
            return E(fgsuVar, fgseVar);
        }
        if (!fgsuVar.w()) {
            return E(fgsuVar, fgseVar);
        }
        fgseVar.m(this);
        return false;
    }

    final boolean c(fgsu fgsuVar, fgse fgseVar) {
        if (w(fgsuVar)) {
            fgseVar.r((fgsn) fgsuVar);
            return true;
        }
        if (fgsuVar.t()) {
            fgseVar.s((fgso) fgsuVar);
            return true;
        }
        if (fgsuVar.u()) {
            fgseVar.m(this);
            return false;
        }
        if (fgsuVar.x() && ((fgss) fgsuVar).b.equals("html")) {
            return InBody.a(fgsuVar, fgseVar);
        }
        if (fgsuVar.x()) {
            fgss fgssVar = (fgss) fgsuVar;
            if (fgssVar.b.equals("head")) {
                fgseVar.l = fgseVar.f(fgssVar);
                fgseVar.i = InHead;
                return true;
            }
        }
        if (fgsuVar.w() && fgre.g(((fgsr) fgsuVar).b, fgsf.e)) {
            fgseVar.ad("head");
            return fgseVar.N(fgsuVar);
        }
        if (fgsuVar.w()) {
            fgseVar.m(this);
            return false;
        }
        fgseVar.ad("head");
        return fgseVar.N(fgsuVar);
    }

    final boolean d(fgsu fgsuVar, fgse fgseVar) {
        if (w(fgsuVar)) {
            fgseVar.r((fgsn) fgsuVar);
            return true;
        }
        int i = fgsuVar.h;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            fgseVar.m(this);
            return false;
        }
        if (i2 == 1) {
            fgss fgssVar = (fgss) fgsuVar;
            String str = fgssVar.b;
            if (str.equals("html")) {
                return InBody.a(fgsuVar, fgseVar);
            }
            if (fgre.g(str, fgsf.a)) {
                fgrs fgrsVarG = fgseVar.g(fgssVar);
                if (str.equals("base") && fgrsVarG.W("href") && !fgseVar.k) {
                    String strHR = fgrsVarG.hR("href");
                    if (strHR.length() != 0) {
                        fgseVar.y = strHR;
                        fgseVar.k = true;
                        fgseVar.w.U(strHR);
                    }
                }
            } else if (str.equals("meta")) {
                fgseVar.g(fgssVar);
            } else if (str.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE)) {
                fgseVar.v.q(fgsx.Rcdata);
                fgseVar.v();
                fgseVar.i = Text;
                fgseVar.f(fgssVar);
            } else if (fgre.g(str, fgsf.b)) {
                v(fgssVar, fgseVar);
            } else if (str.equals("noscript")) {
                fgseVar.f(fgssVar);
                fgseVar.i = InHeadNoscript;
            } else if (str.equals("script")) {
                fgseVar.v.q(fgsx.ScriptData);
                fgseVar.v();
                fgseVar.i = Text;
                fgseVar.f(fgssVar);
            } else {
                if (str.equals("head")) {
                    fgseVar.m(this);
                    return false;
                }
                if (!str.equals("template")) {
                    return F(fgsuVar, fgseVar);
                }
                fgseVar.f(fgssVar);
                fgseVar.u();
                fgseVar.r = false;
                fgsg fgsgVar = InTemplate;
                fgseVar.i = fgsgVar;
                fgseVar.z(fgsgVar);
            }
        } else if (i2 == 2) {
            String str2 = ((fgsr) fgsuVar).b;
            if (str2.equals("head")) {
                fgseVar.T();
                fgseVar.i = AfterHead;
            } else {
                if (fgre.g(str2, fgsf.c)) {
                    return F(fgsuVar, fgseVar);
                }
                if (!str2.equals("template")) {
                    fgseVar.m(this);
                    return false;
                }
                if (fgseVar.K(str2)) {
                    fgseVar.p(true);
                    if (!str2.equals(fgseVar.Z().n())) {
                        fgseVar.m(this);
                    }
                    fgseVar.V(str2);
                    fgseVar.i();
                    fgseVar.W();
                    fgseVar.P();
                } else {
                    fgseVar.m(this);
                }
            }
        } else {
            if (i2 != 3) {
                return F(fgsuVar, fgseVar);
            }
            fgseVar.s((fgso) fgsuVar);
        }
        return true;
    }

    final boolean e(fgsu fgsuVar, fgse fgseVar) {
        if (fgsuVar.u()) {
            fgseVar.m(this);
        } else {
            if (fgsuVar.x() && ((fgss) fgsuVar).b.equals("html")) {
                return fgseVar.O(fgsuVar, InBody);
            }
            if (!fgsuVar.w() || !((fgsr) fgsuVar).b.equals("noscript")) {
                if (w(fgsuVar) || fgsuVar.t() || (fgsuVar.x() && fgre.g(((fgss) fgsuVar).b, fgsf.f))) {
                    return fgseVar.O(fgsuVar, InHead);
                }
                if (fgsuVar.w() && ((fgsr) fgsuVar).b.equals("br")) {
                    G(fgsuVar, fgseVar);
                    return true;
                }
                if ((fgsuVar.x() && fgre.g(((fgss) fgsuVar).b, fgsf.I)) || fgsuVar.w()) {
                    fgseVar.m(this);
                    return false;
                }
                G(fgsuVar, fgseVar);
                return true;
            }
            fgseVar.T();
            fgseVar.i = InHead;
        }
        return true;
    }

    final boolean f(fgsu fgsuVar, fgse fgseVar) {
        fgrs fgrsVar;
        String str = ((fgsr) fgsuVar).b;
        ArrayList arrayList = fgseVar.x;
        if (fgseVar.e(str) == null) {
            fgseVar.m(this);
            return false;
        }
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return true;
            }
            fgrsVar = (fgrs) arrayList.get(size);
            if (fgrsVar.n().equals(str)) {
                fgseVar.o(str);
                if (!fgseVar.ab(str)) {
                    fgseVar.m(this);
                }
                fgseVar.V(str);
                return true;
            }
        } while (!fgse.S(fgrsVar));
        fgseVar.m(this);
        return false;
    }

    final boolean g(fgsu fgsuVar, fgse fgseVar) {
        if (fgsuVar.h == 5) {
            fgsn fgsnVar = (fgsn) fgsuVar;
            if (fgsnVar.a.equals(y)) {
                fgseVar.m(this);
                return false;
            }
            fgseVar.p.add(fgsnVar.a);
            return true;
        }
        if (fgseVar.p.size() > 0) {
            for (String str : fgseVar.p) {
                if (fgre.h(str)) {
                    fgsn fgsnVar2 = new fgsn();
                    fgsnVar2.a = str;
                    fgseVar.r(fgsnVar2);
                } else {
                    fgseVar.m(this);
                    if (fgre.g(fgseVar.Z().n(), fgsf.A)) {
                        fgseVar.s = true;
                        fgsn fgsnVar3 = new fgsn();
                        fgsnVar3.a = str;
                        fgseVar.O(fgsnVar3, InBody);
                        fgseVar.s = false;
                    } else {
                        fgsn fgsnVar4 = new fgsn();
                        fgsnVar4.a = str;
                        fgseVar.O(fgsnVar4, InBody);
                    }
                }
            }
            fgseVar.w();
        }
        fgseVar.i = fgseVar.j;
        return fgseVar.N(fgsuVar);
    }

    final boolean h(fgsu fgsuVar, fgse fgseVar) {
        if (fgsuVar.w()) {
            fgsr fgsrVar = (fgsr) fgsuVar;
            if (fgsrVar.b.equals("caption")) {
                if (!fgseVar.J(fgsrVar.b)) {
                    fgseVar.m(this);
                    return false;
                }
                fgseVar.n();
                if (!fgseVar.ab("caption")) {
                    fgseVar.m(this);
                }
                fgseVar.V("caption");
                fgseVar.i();
                fgseVar.i = InTable;
                return true;
            }
        }
        if ((fgsuVar.x() && fgre.g(((fgss) fgsuVar).b, fgsf.y)) || (fgsuVar.w() && ((fgsr) fgsuVar).b.equals("table"))) {
            fgseVar.m(this);
            if (fgseVar.ac("caption")) {
                return fgseVar.N(fgsuVar);
            }
            return true;
        }
        if (!fgsuVar.w() || !fgre.g(((fgsr) fgsuVar).b, fgsf.J)) {
            return fgseVar.O(fgsuVar, InBody);
        }
        fgseVar.m(this);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean i(defpackage.fgsu r11, defpackage.fgse r12) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgsg.i(fgsu, fgse):boolean");
    }

    final boolean j(fgsu fgsuVar, fgse fgseVar) {
        int i = fgsuVar.h;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            fgss fgssVar = (fgss) fgsuVar;
            String str = fgssVar.b;
            if (!str.equals("tr")) {
                if (!fgre.g(str, fgsf.v)) {
                    return fgre.g(str, fgsf.B) ? y(fgsuVar, fgseVar) : z(fgsuVar, fgseVar);
                }
                fgseVar.m(this);
                fgseVar.ad("tr");
                return fgseVar.N(fgssVar);
            }
            fgseVar.j();
            fgseVar.f(fgssVar);
            fgseVar.i = InRow;
        } else {
            if (i2 != 2) {
                return z(fgsuVar, fgseVar);
            }
            String str2 = ((fgsr) fgsuVar).b;
            if (!fgre.g(str2, fgsf.H)) {
                if (str2.equals("table")) {
                    return y(fgsuVar, fgseVar);
                }
                if (!fgre.g(str2, fgsf.C)) {
                    return z(fgsuVar, fgseVar);
                }
                fgseVar.m(this);
                return false;
            }
            if (!fgseVar.J(str2)) {
                fgseVar.m(this);
                return false;
            }
            fgseVar.j();
            fgseVar.T();
            fgseVar.i = InTable;
        }
        return true;
    }

    final boolean k(fgsu fgsuVar, fgse fgseVar) {
        if (fgsuVar.x()) {
            fgss fgssVar = (fgss) fgsuVar;
            String str = fgssVar.b;
            if (!fgre.g(str, fgsf.v)) {
                return fgre.g(str, fgsf.D) ? B(fgsuVar, fgseVar) : A(fgsuVar, fgseVar);
            }
            fgseVar.l();
            fgseVar.f(fgssVar);
            fgseVar.i = InCell;
            fgseVar.u();
            return true;
        }
        if (!fgsuVar.w()) {
            return A(fgsuVar, fgseVar);
        }
        String str2 = ((fgsr) fgsuVar).b;
        if (str2.equals("tr")) {
            if (!fgseVar.J(str2)) {
                fgseVar.m(this);
                return false;
            }
            fgseVar.l();
            fgseVar.T();
            fgseVar.i = InTableBody;
            return true;
        }
        if (str2.equals("table")) {
            return B(fgsuVar, fgseVar);
        }
        if (!fgre.g(str2, fgsf.s)) {
            if (!fgre.g(str2, fgsf.E)) {
                return A(fgsuVar, fgseVar);
            }
            fgseVar.m(this);
            return false;
        }
        if (!fgseVar.J(str2) || !fgseVar.J("tr")) {
            fgseVar.m(this);
            return false;
        }
        fgseVar.l();
        fgseVar.T();
        fgseVar.i = InTableBody;
        return true;
    }

    final boolean l(fgsu fgsuVar, fgse fgseVar) {
        if (!fgsuVar.w()) {
            if (!fgsuVar.x() || !fgre.g(((fgss) fgsuVar).b, fgsf.y)) {
                return C(fgsuVar, fgseVar);
            }
            if (fgseVar.J("td") || fgseVar.J("th")) {
                D(fgseVar);
                return fgseVar.N(fgsuVar);
            }
            fgseVar.m(this);
            return false;
        }
        String str = ((fgsr) fgsuVar).b;
        if (!fgre.g(str, fgsf.v)) {
            if (fgre.g(str, fgsf.w)) {
                fgseVar.m(this);
                return false;
            }
            if (!fgre.g(str, fgsf.x)) {
                return C(fgsuVar, fgseVar);
            }
            if (fgseVar.J(str)) {
                D(fgseVar);
                return fgseVar.N(fgsuVar);
            }
            fgseVar.m(this);
            return false;
        }
        if (!fgseVar.J(str)) {
            fgseVar.m(this);
            fgseVar.i = InRow;
            return false;
        }
        fgseVar.n();
        if (!fgseVar.ab(str)) {
            fgseVar.m(this);
        }
        fgseVar.V(str);
        fgseVar.i();
        fgseVar.i = InRow;
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean m(defpackage.fgsu r11, defpackage.fgse r12) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgsg.m(fgsu, fgse):boolean");
    }

    final boolean n(fgsu fgsuVar, fgse fgseVar) {
        if (fgsuVar.x() && fgre.g(((fgss) fgsuVar).b, fgsf.G)) {
            fgseVar.m(this);
            fgseVar.V("select");
            fgseVar.P();
            return fgseVar.N(fgsuVar);
        }
        if (fgsuVar.w()) {
            fgsr fgsrVar = (fgsr) fgsuVar;
            if (fgre.g(fgsrVar.b, fgsf.G)) {
                fgseVar.m(this);
                if (!fgseVar.J(fgsrVar.b)) {
                    return false;
                }
                fgseVar.V("select");
                fgseVar.P();
                return fgseVar.N(fgsuVar);
            }
        }
        return fgseVar.O(fgsuVar, InSelect);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean o(defpackage.fgsu r5, defpackage.fgse r6) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgsg.o(fgsu, fgse):boolean");
    }

    final boolean p(fgsu fgsuVar, fgse fgseVar) {
        if (w(fgsuVar)) {
            fgseVar.r((fgsn) fgsuVar);
            return true;
        }
        if (fgsuVar.t()) {
            fgseVar.s((fgso) fgsuVar);
            return true;
        }
        if (fgsuVar.u()) {
            fgseVar.m(this);
            return false;
        }
        if (fgsuVar.x() && ((fgss) fgsuVar).b.equals("html")) {
            return fgseVar.O(fgsuVar, InBody);
        }
        if (fgsuVar.w() && ((fgsr) fgsuVar).b.equals("html")) {
            if (fgseVar.K("html")) {
                fgseVar.V("html");
            }
            fgseVar.i = AfterAfterBody;
            return true;
        }
        if (fgsuVar.v()) {
            return true;
        }
        fgseVar.m(this);
        fgseVar.D();
        return fgseVar.N(fgsuVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean q(defpackage.fgsu r9, defpackage.fgse r10) {
        /*
            r8 = this;
            boolean r0 = w(r9)
            r1 = 1
            if (r0 == 0) goto Le
            fgsn r9 = (defpackage.fgsn) r9
            r10.r(r9)
            goto Lbd
        Le:
            boolean r0 = r9.t()
            if (r0 == 0) goto L1b
            fgso r9 = (defpackage.fgso) r9
            r10.s(r9)
            goto Lbd
        L1b:
            boolean r0 = r9.u()
            r2 = 0
            if (r0 == 0) goto L26
            r10.m(r8)
            return r2
        L26:
            boolean r0 = r9.x()
            java.lang.String r3 = "html"
            java.lang.String r4 = "frameset"
            if (r0 == 0) goto L85
            fgss r9 = (defpackage.fgss) r9
            java.lang.String r0 = r9.b
            int r5 = r0.hashCode()
            r6 = 3
            r7 = 2
            switch(r5) {
                case -1644953643: goto L5a;
                case 3213227: goto L52;
                case 97692013: goto L48;
                case 1192721831: goto L3e;
                default: goto L3d;
            }
        L3d:
            goto L62
        L3e:
            java.lang.String r3 = "noframes"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L62
            r0 = r6
            goto L63
        L48:
            java.lang.String r3 = "frame"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L62
            r0 = r7
            goto L63
        L52:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L62
            r0 = r2
            goto L63
        L5a:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L62
            r0 = r1
            goto L63
        L62:
            r0 = -1
        L63:
            if (r0 == 0) goto L7e
            if (r0 == r1) goto L7a
            if (r0 == r7) goto L76
            if (r0 == r6) goto L6f
            r10.m(r8)
            return r2
        L6f:
            fgsg r0 = defpackage.fgsg.InHead
            boolean r9 = r10.O(r9, r0)
            return r9
        L76:
            r10.g(r9)
            goto Lbd
        L7a:
            r10.f(r9)
            goto Lbd
        L7e:
            fgsg r0 = defpackage.fgsg.InBody
            boolean r9 = r10.O(r9, r0)
            return r9
        L85:
            boolean r0 = r9.w()
            if (r0 == 0) goto Lae
            r0 = r9
            fgsr r0 = (defpackage.fgsr) r0
            java.lang.String r0 = r0.b
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto Lae
            boolean r9 = r10.ab(r3)
            if (r9 == 0) goto La0
            r10.m(r8)
            return r2
        La0:
            r10.T()
            boolean r9 = r10.ab(r4)
            if (r9 != 0) goto Lbd
            fgsg r9 = defpackage.fgsg.AfterFrameset
            r10.i = r9
            goto Lbd
        Lae:
            boolean r9 = r9.v()
            if (r9 == 0) goto Lbe
            boolean r9 = r10.ab(r3)
            if (r9 != 0) goto Lbd
            r10.m(r8)
        Lbd:
            return r1
        Lbe:
            r10.m(r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgsg.q(fgsu, fgse):boolean");
    }

    final boolean r(fgsu fgsuVar, fgse fgseVar) {
        if (w(fgsuVar)) {
            fgseVar.r((fgsn) fgsuVar);
            return true;
        }
        if (fgsuVar.t()) {
            fgseVar.s((fgso) fgsuVar);
            return true;
        }
        if (fgsuVar.u()) {
            fgseVar.m(this);
            return false;
        }
        if (fgsuVar.x() && ((fgss) fgsuVar).b.equals("html")) {
            return fgseVar.O(fgsuVar, InBody);
        }
        if (fgsuVar.w() && ((fgsr) fgsuVar).b.equals("html")) {
            fgseVar.i = AfterAfterFrameset;
            return true;
        }
        if (fgsuVar.x() && ((fgss) fgsuVar).b.equals("noframes")) {
            return fgseVar.O(fgsuVar, InHead);
        }
        if (fgsuVar.v()) {
            return true;
        }
        fgseVar.m(this);
        return false;
    }

    final boolean s(fgsu fgsuVar, fgse fgseVar) {
        if (fgsuVar.t()) {
            fgseVar.s((fgso) fgsuVar);
            return true;
        }
        if (fgsuVar.u() || (fgsuVar.x() && ((fgss) fgsuVar).b.equals("html"))) {
            return fgseVar.O(fgsuVar, InBody);
        }
        if (w(fgsuVar)) {
            fgseVar.r((fgsn) fgsuVar);
            return true;
        }
        if (fgsuVar.v()) {
            return true;
        }
        fgseVar.m(this);
        fgseVar.D();
        return fgseVar.N(fgsuVar);
    }

    final void u(fgsu fgsuVar, fgse fgseVar) {
        fgseVar.m(this);
        fgseVar.s = true;
        fgseVar.O(fgsuVar, InBody);
        fgseVar.s = false;
    }
}
