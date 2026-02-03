package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
enum fgsx {
    Data,
    CharacterReferenceInData,
    Rcdata,
    CharacterReferenceInRcdata,
    Rawtext,
    ScriptData,
    PLAINTEXT,
    TagOpen,
    EndTagOpen,
    TagName,
    RcdataLessthanSign,
    RCDATAEndTagOpen,
    RCDATAEndTagName,
    RawtextLessthanSign,
    RawtextEndTagOpen,
    RawtextEndTagName,
    ScriptDataLessthanSign,
    ScriptDataEndTagOpen,
    ScriptDataEndTagName,
    ScriptDataEscapeStart,
    ScriptDataEscapeStartDash,
    ScriptDataEscaped,
    ScriptDataEscapedDash,
    ScriptDataEscapedDashDash,
    ScriptDataEscapedLessthanSign,
    ScriptDataEscapedEndTagOpen,
    ScriptDataEscapedEndTagName,
    ScriptDataDoubleEscapeStart,
    ScriptDataDoubleEscaped,
    ScriptDataDoubleEscapedDash,
    ScriptDataDoubleEscapedDashDash,
    ScriptDataDoubleEscapedLessthanSign,
    ScriptDataDoubleEscapeEnd,
    BeforeAttributeName,
    AttributeName,
    AfterAttributeName,
    BeforeAttributeValue,
    AttributeValue_doubleQuoted,
    AttributeValue_singleQuoted,
    AttributeValue_unquoted,
    AfterAttributeValue_quoted,
    SelfClosingStartTag,
    BogusComment,
    MarkupDeclarationOpen,
    CommentStart,
    CommentStartDash,
    Comment,
    CommentEndDash,
    CommentEnd,
    CommentEndBang,
    Doctype,
    BeforeDoctypeName,
    DoctypeName,
    AfterDoctypeName,
    AfterDoctypePublicKeyword,
    BeforeDoctypePublicIdentifier,
    DoctypePublicIdentifier_doubleQuoted,
    DoctypePublicIdentifier_singleQuoted,
    AfterDoctypePublicIdentifier,
    BetweenDoctypePublicAndSystemIdentifiers,
    AfterDoctypeSystemKeyword,
    BeforeDoctypeSystemIdentifier,
    DoctypeSystemIdentifier_doubleQuoted,
    DoctypeSystemIdentifier_singleQuoted,
    AfterDoctypeSystemIdentifier,
    BogusDoctype,
    CdataSection;

    static final char[] ap = {'\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', '<', '=', '>'};
    static final char[] aq = {0, '\t', '\n', '\f', '\r', ' ', '\"', '&', '\'', '<', '=', '>', '`'};
    private static final String ar = "�";

    private static final void A(fgsw fgswVar, fgsd fgsdVar) {
        fgswVar.h("</");
        fgswVar.i(fgswVar.b);
        fgsdVar.r();
        fgswVar.q(Rcdata);
    }

    public static void a(fgsw fgswVar, fgsd fgsdVar, fgsx fgsxVar, fgsx fgsxVar2) throws IOException {
        if (fgsdVar.A()) {
            String strH = fgsdVar.h();
            fgswVar.b.append(strH);
            fgswVar.h(strH);
            return;
        }
        char cA = fgsdVar.a();
        if (cA != '\t' && cA != '\n' && cA != '\f' && cA != '\r' && cA != ' ' && cA != '/' && cA != '>') {
            fgsdVar.r();
            fgswVar.q(fgsxVar2);
        } else {
            if (fgswVar.b.toString().equals("script")) {
                fgswVar.q(fgsxVar);
            } else {
                fgswVar.q(fgsxVar2);
            }
            fgswVar.g(cA);
        }
    }

    public static void b(fgsw fgswVar, fgsd fgsdVar, fgsx fgsxVar) throws IOException {
        if (fgsdVar.A()) {
            String strH = fgsdVar.h();
            fgswVar.e.k(strH);
            fgswVar.b.append(strH);
            return;
        }
        if (fgswVar.r() && !fgsdVar.t()) {
            char cA = fgsdVar.a();
            if (cA == '\t' || cA == '\n' || cA == '\f' || cA == '\r' || cA == ' ') {
                fgswVar.q(BeforeAttributeName);
                return;
            }
            if (cA == '/') {
                fgswVar.q(SelfClosingStartTag);
                return;
            } else {
                if (cA == '>') {
                    fgswVar.m();
                    fgswVar.q(Data);
                    return;
                }
                fgswVar.b.append(cA);
            }
        }
        fgswVar.h("</");
        fgswVar.i(fgswVar.b);
        fgswVar.q(fgsxVar);
    }

    public static void c(fgsw fgswVar, fgsx fgsxVar) {
        int[] iArrS = fgswVar.s(null, false);
        if (iArrS == null) {
            fgswVar.g('&');
        } else {
            fgswVar.h(new String(iArrS, 0, iArrS.length));
        }
        fgswVar.q(fgsxVar);
    }

    public static void d(fgsw fgswVar, fgsd fgsdVar, fgsx fgsxVar, fgsx fgsxVar2) {
        if (fgsdVar.z()) {
            fgswVar.a(false);
            fgswVar.q(fgsxVar);
        } else {
            fgswVar.h("</");
            fgswVar.q(fgsxVar2);
        }
    }

    public static void e(fgsw fgswVar, fgsd fgsdVar, fgsx fgsxVar, fgsx fgsxVar2) throws IOException {
        char cB = fgsdVar.b();
        if (cB == 0) {
            fgswVar.o(fgsxVar);
            fgsdVar.n();
            fgswVar.g((char) 65533);
            return;
        }
        if (cB == '<') {
            fgswVar.c(fgsxVar2);
            return;
        }
        if (cB == 65535) {
            fgswVar.j(new fgsq());
            return;
        }
        int i = fgsdVar.d;
        int i2 = fgsdVar.b;
        char[] cArr = fgsdVar.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            } else {
                i3++;
            }
        }
        fgsdVar.d = i3;
        fgswVar.h(i3 > i ? fgsd.e(fgsdVar.a, fgsdVar.f, i, i3 - i) : "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (r1 == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final void s(defpackage.fgsw r5, defpackage.fgsd r6) throws java.io.IOException {
        /*
            r0 = 47
            boolean r0 = r6.x(r0)
            if (r0 == 0) goto L11
            r5.f()
            fgsx r6 = defpackage.fgsx.RCDATAEndTagOpen
            r5.c(r6)
            return
        L11:
            boolean r0 = r6.z()
            if (r0 == 0) goto L7c
            java.lang.String r0 = r5.i
            if (r0 == 0) goto L7c
            java.lang.String r1 = r5.j
            if (r1 != 0) goto L27
            java.lang.String r1 = "</"
            java.lang.String r0 = r1.concat(r0)
            r5.j = r0
        L27:
            java.lang.String r0 = r5.j
            java.lang.String r1 = r6.h
            boolean r1 = r0.equals(r1)
            r2 = 0
            r3 = -1
            if (r1 == 0) goto L3c
            int r1 = r6.i
            if (r1 != r3) goto L38
            goto L68
        L38:
            int r4 = r6.d
            if (r1 >= r4) goto L7c
        L3c:
            r6.h = r0
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r0.toLowerCase(r1)
            int r1 = r6.c(r1)
            if (r1 < 0) goto L50
            int r0 = r6.d
            int r0 = r0 + r1
            r6.i = r0
            goto L7c
        L50:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toUpperCase(r1)
            int r0 = r6.c(r0)
            if (r0 < 0) goto L5e
            r1 = 1
            goto L5f
        L5e:
            r1 = r2
        L5f:
            if (r1 == 0) goto L64
            int r3 = r6.d
            int r3 = r3 + r0
        L64:
            r6.i = r3
            if (r1 != 0) goto L7c
        L68:
            fgst r6 = r5.a(r2)
            java.lang.String r0 = r5.i
            r6.q(r0)
            r5.e = r6
            r5.m()
            fgsx r6 = defpackage.fgsx.TagOpen
            r5.q(r6)
            return
        L7c:
            java.lang.String r6 = "<"
            r5.h(r6)
            fgsx r6 = defpackage.fgsx.Rcdata
            r5.q(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgsx.s(fgsw, fgsd):void");
    }

    static final void t(fgsw fgswVar, fgsd fgsdVar) {
        if (!fgsdVar.z()) {
            fgswVar.h("</");
            fgswVar.q(Rcdata);
        } else {
            fgswVar.a(false);
            fgswVar.e.j(fgsdVar.b());
            fgswVar.b.append(fgsdVar.b());
            fgswVar.c(RCDATAEndTagName);
        }
    }

    static final void u(fgsw fgswVar, fgsd fgsdVar) throws IOException {
        if (fgsdVar.z()) {
            String strH = fgsdVar.h();
            fgswVar.e.k(strH);
            fgswVar.b.append(strH);
            return;
        }
        char cA = fgsdVar.a();
        if (cA == '\t' || cA == '\n' || cA == '\f' || cA == '\r' || cA == ' ') {
            if (fgswVar.r()) {
                fgswVar.q(BeforeAttributeName);
                return;
            } else {
                A(fgswVar, fgsdVar);
                return;
            }
        }
        if (cA == '/') {
            if (fgswVar.r()) {
                fgswVar.q(SelfClosingStartTag);
                return;
            } else {
                A(fgswVar, fgsdVar);
                return;
            }
        }
        if (cA != '>') {
            A(fgswVar, fgsdVar);
        } else if (!fgswVar.r()) {
            A(fgswVar, fgsdVar);
        } else {
            fgswVar.m();
            fgswVar.q(Data);
        }
    }

    static final void v(fgsw fgswVar, fgsd fgsdVar) {
        if (fgsdVar.x('/')) {
            fgswVar.f();
            fgswVar.c(RawtextEndTagOpen);
        } else {
            fgswVar.g('<');
            fgswVar.q(Rawtext);
        }
    }

    static final void w(fgsw fgswVar, fgsd fgsdVar) {
        if (!fgsdVar.x('-')) {
            fgswVar.q(ScriptData);
        } else {
            fgswVar.g('-');
            fgswVar.c(ScriptDataEscapeStartDash);
        }
    }

    static final void x(fgsw fgswVar, fgsd fgsdVar) {
        if (!fgsdVar.x('-')) {
            fgswVar.q(ScriptData);
        } else {
            fgswVar.g('-');
            fgswVar.c(ScriptDataEscapedDashDash);
        }
    }

    static final void y(fgsw fgswVar, fgsd fgsdVar) {
        if (fgsdVar.z()) {
            fgswVar.f();
            fgswVar.b.append(fgsdVar.b());
            fgswVar.h("<");
            fgswVar.g(fgsdVar.b());
            fgswVar.c(ScriptDataDoubleEscapeStart);
            return;
        }
        if (fgsdVar.x('/')) {
            fgswVar.f();
            fgswVar.c(ScriptDataEscapedEndTagOpen);
        } else {
            fgswVar.g('<');
            fgswVar.q(ScriptDataEscaped);
        }
    }

    static final void z(fgsw fgswVar, fgsd fgsdVar) {
        if (!fgsdVar.z()) {
            fgswVar.h("</");
            fgswVar.q(ScriptDataEscaped);
        } else {
            fgswVar.a(false);
            fgswVar.e.j(fgsdVar.b());
            fgswVar.b.append(fgsdVar.b());
            fgswVar.c(ScriptDataEscapedEndTagName);
        }
    }

    final void f(fgsw fgswVar, fgsd fgsdVar) throws IOException {
        char cB = fgsdVar.b();
        if (cB == 0) {
            fgswVar.o(this);
            fgswVar.g(fgsdVar.a());
        } else {
            if (cB == '&') {
                fgswVar.c(CharacterReferenceInData);
                return;
            }
            if (cB == '<') {
                fgswVar.c(TagOpen);
            } else if (cB != 65535) {
                fgswVar.h(fgsdVar.g());
            } else {
                fgswVar.j(new fgsq());
            }
        }
    }

    final void g(fgsw fgswVar, fgsd fgsdVar) throws IOException {
        char c;
        fgsdVar.o();
        int i = fgsdVar.d;
        int i2 = fgsdVar.b;
        char[] cArr = fgsdVar.a;
        int i3 = i;
        while (i3 < i2 && (c = cArr[i3]) != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ' && c != '/' && c != '<' && c != '>') {
            i3++;
        }
        fgsdVar.d = i3;
        fgswVar.e.k(i3 > i ? fgsd.e(fgsdVar.a, fgsdVar.f, i, i3 - i) : "");
        char cA = fgsdVar.a();
        if (cA == 0) {
            fgswVar.e.k(ar);
            return;
        }
        if (cA != ' ') {
            if (cA == '/') {
                fgswVar.q(SelfClosingStartTag);
                return;
            }
            if (cA == '<') {
                fgsdVar.r();
                fgswVar.o(this);
            } else if (cA != '>') {
                if (cA == 65535) {
                    fgswVar.n(this);
                    fgswVar.q(Data);
                    return;
                } else if (cA != '\t' && cA != '\n' && cA != '\f' && cA != '\r') {
                    fgswVar.e.j(cA);
                    return;
                }
            }
            fgswVar.m();
            fgswVar.q(Data);
            return;
        }
        fgswVar.q(BeforeAttributeName);
    }

    final void h(fgsw fgswVar, fgsd fgsdVar) throws IOException {
        char cA = fgsdVar.a();
        if (cA == '!') {
            fgswVar.h("<!");
            fgswVar.q(ScriptDataEscapeStart);
            return;
        }
        if (cA == '/') {
            fgswVar.f();
            fgswVar.q(ScriptDataEndTagOpen);
        } else if (cA != 65535) {
            fgswVar.h("<");
            fgsdVar.r();
            fgswVar.q(ScriptData);
        } else {
            fgswVar.h("<");
            fgswVar.n(this);
            fgswVar.q(Data);
        }
    }

    final void i(fgsw fgswVar, fgsd fgsdVar) throws IOException {
        if (fgsdVar.t()) {
            fgswVar.n(this);
            fgswVar.q(Data);
            return;
        }
        char cB = fgsdVar.b();
        if (cB == 0) {
            fgswVar.o(this);
            fgsdVar.n();
            fgswVar.g((char) 65533);
        } else if (cB == '-') {
            fgswVar.g('-');
            fgswVar.c(ScriptDataEscapedDash);
        } else if (cB != '<') {
            fgswVar.h(fgsdVar.j('-', '<', 0));
        } else {
            fgswVar.c(ScriptDataEscapedLessthanSign);
        }
    }

    final void j(fgsw fgswVar, fgsd fgsdVar) throws IOException {
        if (fgsdVar.t()) {
            fgswVar.n(this);
            fgswVar.q(Data);
            return;
        }
        char cA = fgsdVar.a();
        if (cA == 0) {
            fgswVar.o(this);
            fgswVar.g((char) 65533);
            fgswVar.q(ScriptDataEscaped);
        } else if (cA == '-') {
            fgswVar.g(cA);
            fgswVar.q(ScriptDataEscapedDashDash);
        } else if (cA == '<') {
            fgswVar.q(ScriptDataEscapedLessthanSign);
        } else {
            fgswVar.g(cA);
            fgswVar.q(ScriptDataEscaped);
        }
    }

    final void k(fgsw fgswVar, fgsd fgsdVar) throws IOException {
        if (fgsdVar.t()) {
            fgswVar.n(this);
            fgswVar.q(Data);
            return;
        }
        char cA = fgsdVar.a();
        if (cA == 0) {
            fgswVar.o(this);
            fgswVar.g((char) 65533);
            fgswVar.q(ScriptDataEscaped);
        } else {
            if (cA == '-') {
                fgswVar.g(cA);
                return;
            }
            if (cA == '<') {
                fgswVar.q(ScriptDataEscapedLessthanSign);
            } else if (cA != '>') {
                fgswVar.g(cA);
                fgswVar.q(ScriptDataEscaped);
            } else {
                fgswVar.g(cA);
                fgswVar.q(ScriptData);
            }
        }
    }

    final void l(fgsw fgswVar, fgsd fgsdVar) throws IOException {
        char cB = fgsdVar.b();
        if (cB == 0) {
            fgswVar.o(this);
            fgsdVar.n();
            fgswVar.g((char) 65533);
        } else if (cB == '-') {
            fgswVar.g(cB);
            fgswVar.c(ScriptDataDoubleEscapedDash);
        } else if (cB == '<') {
            fgswVar.g(cB);
            fgswVar.c(ScriptDataDoubleEscapedLessthanSign);
        } else if (cB != 65535) {
            fgswVar.h(fgsdVar.j('-', '<', 0));
        } else {
            fgswVar.n(this);
            fgswVar.q(Data);
        }
    }

    final void m(fgsw fgswVar, fgsd fgsdVar) throws IOException {
        char cA = fgsdVar.a();
        if (cA == 0) {
            fgswVar.o(this);
            fgswVar.g((char) 65533);
            fgswVar.q(ScriptDataDoubleEscaped);
        } else if (cA == '-') {
            fgswVar.g(cA);
            fgswVar.q(ScriptDataDoubleEscapedDashDash);
        } else if (cA == '<') {
            fgswVar.g(cA);
            fgswVar.q(ScriptDataDoubleEscapedLessthanSign);
        } else if (cA != 65535) {
            fgswVar.g(cA);
            fgswVar.q(ScriptDataDoubleEscaped);
        } else {
            fgswVar.n(this);
            fgswVar.q(Data);
        }
    }

    final void n(fgsw fgswVar, fgsd fgsdVar) throws IOException {
        char cA = fgsdVar.a();
        if (cA == 0) {
            fgswVar.o(this);
            fgswVar.g((char) 65533);
            fgswVar.q(ScriptDataDoubleEscaped);
            return;
        }
        if (cA == '-') {
            fgswVar.g(cA);
            return;
        }
        if (cA == '<') {
            fgswVar.g(cA);
            fgswVar.q(ScriptDataDoubleEscapedLessthanSign);
        } else if (cA == '>') {
            fgswVar.g(cA);
            fgswVar.q(ScriptData);
        } else if (cA != 65535) {
            fgswVar.g(cA);
            fgswVar.q(ScriptDataDoubleEscaped);
        } else {
            fgswVar.n(this);
            fgswVar.q(Data);
        }
    }

    final void o(fgsw fgswVar, fgsd fgsdVar) throws IOException {
        char cA = fgsdVar.a();
        if (cA == 0) {
            fgsdVar.r();
            fgswVar.o(this);
            fgswVar.e.m();
            fgswVar.q(AttributeName);
            return;
        }
        if (cA != ' ') {
            if (cA != '\"' && cA != '\'') {
                if (cA == '/') {
                    fgswVar.q(SelfClosingStartTag);
                    return;
                }
                if (cA == 65535) {
                    fgswVar.n(this);
                    fgswVar.q(Data);
                    return;
                }
                if (cA == '\t' || cA == '\n' || cA == '\f' || cA == '\r') {
                    return;
                }
                switch (cA) {
                    case '<':
                        fgsdVar.r();
                        fgswVar.o(this);
                        break;
                    case '=':
                        break;
                    case '>':
                        break;
                    default:
                        fgswVar.e.m();
                        fgsdVar.r();
                        fgswVar.q(AttributeName);
                        return;
                }
                fgswVar.m();
                fgswVar.q(Data);
                return;
            }
            fgswVar.o(this);
            fgswVar.e.m();
            fgswVar.e.f(cA);
            fgswVar.q(AttributeName);
        }
    }

    final void p(fgsw fgswVar, fgsd fgsdVar) throws IOException {
        String strK = fgsdVar.k(ap);
        fgst fgstVar = fgswVar.e;
        String strReplace = strK.replace((char) 0, (char) 65533);
        fgstVar.l();
        StringBuilder sb = fgstVar.c;
        if (sb.length() == 0) {
            fgstVar.d = strReplace;
        } else {
            sb.append(strReplace);
        }
        char cA = fgsdVar.a();
        if (cA == '\t' || cA == '\n' || cA == '\f' || cA == '\r' || cA == ' ') {
            fgswVar.q(AfterAttributeName);
            return;
        }
        if (cA != '\"' && cA != '\'') {
            if (cA == '/') {
                fgswVar.q(SelfClosingStartTag);
                return;
            }
            if (cA == 65535) {
                fgswVar.n(this);
                fgswVar.q(Data);
                return;
            }
            switch (cA) {
                case '<':
                    break;
                case '=':
                    fgswVar.q(BeforeAttributeValue);
                    break;
                case '>':
                    fgswVar.m();
                    fgswVar.q(Data);
                    break;
                default:
                    fgswVar.e.f(cA);
                    break;
            }
            return;
        }
        fgswVar.o(this);
        fgswVar.e.f(cA);
    }

    final void q(fgsw fgswVar, fgsd fgsdVar) throws IOException {
        char cA = fgsdVar.a();
        if (cA == 0) {
            fgswVar.o(this);
            fgswVar.e.f((char) 65533);
            fgswVar.q(AttributeName);
            return;
        }
        if (cA != ' ') {
            if (cA != '\"' && cA != '\'') {
                if (cA == '/') {
                    fgswVar.q(SelfClosingStartTag);
                    return;
                }
                if (cA == 65535) {
                    fgswVar.n(this);
                    fgswVar.q(Data);
                    return;
                }
                if (cA == '\t' || cA == '\n' || cA == '\f' || cA == '\r') {
                    return;
                }
                switch (cA) {
                    case '<':
                        break;
                    case '=':
                        fgswVar.q(BeforeAttributeValue);
                        break;
                    case '>':
                        fgswVar.m();
                        fgswVar.q(Data);
                        break;
                    default:
                        fgswVar.e.m();
                        fgsdVar.r();
                        fgswVar.q(AttributeName);
                        break;
                }
                return;
            }
            fgswVar.o(this);
            fgswVar.e.m();
            fgswVar.e.f(cA);
            fgswVar.q(AttributeName);
        }
    }

    final void r(fgsw fgswVar, fgsd fgsdVar) throws IOException {
        char cA = fgsdVar.a();
        if (cA == 0) {
            fgswVar.o(this);
            fgswVar.e.g((char) 65533);
            fgswVar.q(AttributeValue_unquoted);
            return;
        }
        if (cA != ' ') {
            if (cA == '\"') {
                fgswVar.q(AttributeValue_doubleQuoted);
                return;
            }
            if (cA != '`') {
                if (cA == 65535) {
                    fgswVar.n(this);
                    fgswVar.m();
                    fgswVar.q(Data);
                    return;
                }
                if (cA == '\t' || cA == '\n' || cA == '\f' || cA == '\r') {
                    return;
                }
                if (cA == '&') {
                    fgsdVar.r();
                    fgswVar.q(AttributeValue_unquoted);
                    return;
                }
                if (cA == '\'') {
                    fgswVar.q(AttributeValue_singleQuoted);
                    return;
                }
                switch (cA) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        fgswVar.o(this);
                        fgswVar.m();
                        fgswVar.q(Data);
                        break;
                    default:
                        fgsdVar.r();
                        fgswVar.q(AttributeValue_unquoted);
                        break;
                }
                return;
            }
            fgswVar.o(this);
            fgswVar.e.g(cA);
            fgswVar.q(AttributeValue_unquoted);
        }
    }
}
