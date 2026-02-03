package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import com.sun.jna.Function;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgsw {
    static final int[] a = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    private static final char[] k;
    final fgss c;
    final fgsr d;
    fgst e;
    final fgsn f;
    final fgsp g;
    final fgso h;
    public String i;
    public String j;
    private final fgsd l;
    private final fgsi m;
    private int s;
    private final int[] t;
    private final int[] u;
    private fgsx n = fgsx.Data;
    private fgsu o = null;
    private boolean p = false;
    private String q = null;
    private final StringBuilder r = new StringBuilder(1024);
    final StringBuilder b = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        k = cArr;
        Arrays.sort(cArr);
    }

    public fgsw(fgsd fgsdVar, fgsi fgsiVar) {
        fgss fgssVar = new fgss();
        this.c = fgssVar;
        this.d = new fgsr();
        this.e = fgssVar;
        this.f = new fgsn();
        this.g = new fgsp();
        this.h = new fgso();
        this.s = -1;
        this.t = new int[1];
        this.u = new int[2];
        this.l = fgsdVar;
        this.m = fgsiVar;
    }

    private final void t(String str, Object... objArr) {
        fgsi fgsiVar = this.m;
        if (fgsiVar.a()) {
            fgsiVar.add(new fgsh(this.l, String.format("Invalid character reference: ".concat(str), objArr)));
        }
    }

    final fgst a(boolean z) {
        fgst fgstVar = z ? this.c : this.d;
        fgstVar.a();
        this.e = fgstVar;
        return fgstVar;
    }

    public final fgsu b() {
        while (!this.p) {
            fgsx fgsxVar = this.n;
            fgsd fgsdVar = this.l;
            switch (fgsxVar.ordinal()) {
                case 0:
                    fgsxVar.f(this, fgsdVar);
                    break;
                case 1:
                    fgsx.c(this, fgsx.Data);
                    break;
                case 2:
                    char cB = fgsdVar.b();
                    if (cB == 0) {
                        o(fgsxVar);
                        fgsdVar.n();
                        g((char) 65533);
                        break;
                    } else if (cB == '&') {
                        c(fgsx.CharacterReferenceInRcdata);
                        break;
                    } else if (cB == '<') {
                        c(fgsx.RcdataLessthanSign);
                        break;
                    } else if (cB == 65535) {
                        j(new fgsq());
                        break;
                    } else {
                        h(fgsdVar.g());
                        break;
                    }
                case 3:
                    fgsx.c(this, fgsx.Rcdata);
                    break;
                case 4:
                    fgsx.e(this, fgsdVar, fgsxVar, fgsx.RawtextLessthanSign);
                    break;
                case 5:
                    fgsx.e(this, fgsdVar, fgsxVar, fgsx.ScriptDataLessthanSign);
                    break;
                case 6:
                    char cB2 = fgsdVar.b();
                    if (cB2 == 0) {
                        o(fgsxVar);
                        fgsdVar.n();
                        g((char) 65533);
                        break;
                    } else if (cB2 == 65535) {
                        j(new fgsq());
                        break;
                    } else {
                        h(fgsdVar.i((char) 0));
                        break;
                    }
                case 7:
                    char cB3 = fgsdVar.b();
                    if (cB3 == '!') {
                        c(fgsx.MarkupDeclarationOpen);
                        break;
                    } else if (cB3 == '/') {
                        c(fgsx.EndTagOpen);
                        break;
                    } else if (cB3 == '?') {
                        d();
                        q(fgsx.BogusComment);
                        break;
                    } else if (!fgsdVar.z()) {
                        o(fgsxVar);
                        g('<');
                        q(fgsx.Data);
                        break;
                    } else {
                        a(true);
                        q(fgsx.TagName);
                        break;
                    }
                case 8:
                    if (!fgsdVar.t()) {
                        if (!fgsdVar.z()) {
                            if (!fgsdVar.x('>')) {
                                o(fgsxVar);
                                d();
                                this.h.c('/');
                                q(fgsx.BogusComment);
                                break;
                            } else {
                                o(fgsxVar);
                                c(fgsx.Data);
                                break;
                            }
                        } else {
                            a(false);
                            q(fgsx.TagName);
                            break;
                        }
                    } else {
                        n(fgsxVar);
                        h("</");
                        q(fgsx.Data);
                        break;
                    }
                case 9:
                    fgsxVar.g(this, fgsdVar);
                    break;
                case 10:
                    fgsx.s(this, fgsdVar);
                    break;
                case 11:
                    fgsx.t(this, fgsdVar);
                    break;
                case 12:
                    fgsx.u(this, fgsdVar);
                    break;
                case 13:
                    fgsx.v(this, fgsdVar);
                    break;
                case 14:
                    fgsx.d(this, fgsdVar, fgsx.RawtextEndTagName, fgsx.Rawtext);
                    break;
                case 15:
                    fgsx.b(this, fgsdVar, fgsx.Rawtext);
                    break;
                case 16:
                    fgsxVar.h(this, fgsdVar);
                    break;
                case 17:
                    fgsx.d(this, fgsdVar, fgsx.ScriptDataEndTagName, fgsx.ScriptData);
                    break;
                case 18:
                    fgsx.b(this, fgsdVar, fgsx.ScriptData);
                    break;
                case 19:
                    fgsx.w(this, fgsdVar);
                    break;
                case 20:
                    fgsx.x(this, fgsdVar);
                    break;
                case 21:
                    fgsxVar.i(this, fgsdVar);
                    break;
                case 22:
                    fgsxVar.j(this, fgsdVar);
                    break;
                case 23:
                    fgsxVar.k(this, fgsdVar);
                    break;
                case 24:
                    fgsx.y(this, fgsdVar);
                    break;
                case 25:
                    fgsx.z(this, fgsdVar);
                    break;
                case 26:
                    fgsx.b(this, fgsdVar, fgsx.ScriptDataEscaped);
                    break;
                case 27:
                    fgsx.a(this, fgsdVar, fgsx.ScriptDataDoubleEscaped, fgsx.ScriptDataEscaped);
                    break;
                case 28:
                    fgsxVar.l(this, fgsdVar);
                    break;
                case 29:
                    fgsxVar.m(this, fgsdVar);
                    break;
                case 30:
                    fgsxVar.n(this, fgsdVar);
                    break;
                case 31:
                    if (!fgsdVar.x('/')) {
                        q(fgsx.ScriptDataDoubleEscaped);
                        break;
                    } else {
                        g('/');
                        f();
                        c(fgsx.ScriptDataDoubleEscapeEnd);
                        break;
                    }
                case 32:
                    fgsx.a(this, fgsdVar, fgsx.ScriptDataEscaped, fgsx.ScriptDataDoubleEscaped);
                    break;
                case 33:
                    fgsxVar.o(this, fgsdVar);
                    break;
                case 34:
                    fgsxVar.p(this, fgsdVar);
                    break;
                case 35:
                    fgsxVar.q(this, fgsdVar);
                    break;
                case 36:
                    fgsxVar.r(this, fgsdVar);
                    break;
                case 37:
                    String strF = fgsdVar.f(false);
                    if (strF.length() > 0) {
                        this.e.h(strF);
                    } else {
                        this.e.n();
                    }
                    char cA = fgsdVar.a();
                    if (cA == 0) {
                        o(fgsxVar);
                        this.e.g((char) 65533);
                        break;
                    } else if (cA == '\"') {
                        q(fgsx.AfterAttributeValue_quoted);
                        break;
                    } else if (cA == '&') {
                        int[] iArrS = s('\"', true);
                        if (iArrS == null) {
                            this.e.g('&');
                            break;
                        } else {
                            this.e.i(iArrS);
                            break;
                        }
                    } else if (cA == 65535) {
                        n(fgsxVar);
                        q(fgsx.Data);
                        break;
                    } else {
                        this.e.g(cA);
                        break;
                    }
                case 38:
                    String strF2 = fgsdVar.f(true);
                    if (strF2.length() > 0) {
                        this.e.h(strF2);
                    } else {
                        this.e.n();
                    }
                    char cA2 = fgsdVar.a();
                    if (cA2 == 0) {
                        o(fgsxVar);
                        this.e.g((char) 65533);
                        break;
                    } else if (cA2 == 65535) {
                        n(fgsxVar);
                        q(fgsx.Data);
                        break;
                    } else if (cA2 == '&') {
                        int[] iArrS2 = s('\'', true);
                        if (iArrS2 == null) {
                            this.e.g('&');
                            break;
                        } else {
                            this.e.i(iArrS2);
                            break;
                        }
                    } else if (cA2 == '\'') {
                        q(fgsx.AfterAttributeValue_quoted);
                        break;
                    } else {
                        this.e.g(cA2);
                        break;
                    }
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    String strK = fgsdVar.k(fgsx.aq);
                    if (strK.length() > 0) {
                        this.e.h(strK);
                    }
                    char cA3 = fgsdVar.a();
                    if (cA3 == 0) {
                        o(fgsxVar);
                        this.e.g((char) 65533);
                        break;
                    } else {
                        if (cA3 != ' ') {
                            if (cA3 != '\"' && cA3 != '`') {
                                if (cA3 == 65535) {
                                    n(fgsxVar);
                                    q(fgsx.Data);
                                    break;
                                } else if (cA3 != '\t' && cA3 != '\n' && cA3 != '\f' && cA3 != '\r') {
                                    if (cA3 == '&') {
                                        int[] iArrS3 = s('>', true);
                                        if (iArrS3 == null) {
                                            this.e.g('&');
                                            break;
                                        } else {
                                            this.e.i(iArrS3);
                                            break;
                                        }
                                    } else if (cA3 != '\'') {
                                        switch (cA3) {
                                            case '<':
                                            case '=':
                                                break;
                                            case '>':
                                                m();
                                                q(fgsx.Data);
                                                continue;
                                            default:
                                                this.e.g(cA3);
                                                continue;
                                        }
                                    }
                                }
                            }
                            o(fgsxVar);
                            this.e.g(cA3);
                            break;
                        }
                        q(fgsx.BeforeAttributeName);
                        break;
                    }
                    break;
                case 40:
                    char cA4 = fgsdVar.a();
                    if (cA4 != '\t' && cA4 != '\n' && cA4 != '\f' && cA4 != '\r' && cA4 != ' ') {
                        if (cA4 == '/') {
                            q(fgsx.SelfClosingStartTag);
                            break;
                        } else if (cA4 == '>') {
                            m();
                            q(fgsx.Data);
                            break;
                        } else if (cA4 == 65535) {
                            n(fgsxVar);
                            q(fgsx.Data);
                            break;
                        } else {
                            fgsdVar.r();
                            o(fgsxVar);
                            q(fgsx.BeforeAttributeName);
                            break;
                        }
                    } else {
                        q(fgsx.BeforeAttributeName);
                        break;
                    }
                case 41:
                    char cA5 = fgsdVar.a();
                    if (cA5 == '>') {
                        this.e.f = true;
                        m();
                        q(fgsx.Data);
                        break;
                    } else if (cA5 == 65535) {
                        n(fgsxVar);
                        q(fgsx.Data);
                        break;
                    } else {
                        fgsdVar.r();
                        o(fgsxVar);
                        q(fgsx.BeforeAttributeName);
                        break;
                    }
                case 42:
                    this.h.d(fgsdVar.i('>'));
                    char cB4 = fgsdVar.b();
                    if (cB4 != '>' && cB4 != 65535) {
                        break;
                    } else {
                        fgsdVar.a();
                        k();
                        q(fgsx.Data);
                        break;
                    }
                    break;
                case 43:
                    if (!fgsdVar.v("--")) {
                        if (!fgsdVar.w("DOCTYPE")) {
                            if (!fgsdVar.v("[CDATA[")) {
                                o(fgsxVar);
                                d();
                                q(fgsx.BogusComment);
                                break;
                            } else {
                                f();
                                q(fgsx.CdataSection);
                                break;
                            }
                        } else {
                            q(fgsx.Doctype);
                            break;
                        }
                    } else {
                        this.h.a();
                        q(fgsx.CommentStart);
                        break;
                    }
                case 44:
                    char cA6 = fgsdVar.a();
                    if (cA6 == 0) {
                        o(fgsxVar);
                        this.h.c((char) 65533);
                        q(fgsx.Comment);
                        break;
                    } else if (cA6 == '-') {
                        q(fgsx.CommentStartDash);
                        break;
                    } else if (cA6 == '>') {
                        o(fgsxVar);
                        k();
                        q(fgsx.Data);
                        break;
                    } else if (cA6 == 65535) {
                        n(fgsxVar);
                        k();
                        q(fgsx.Data);
                        break;
                    } else {
                        fgsdVar.r();
                        q(fgsx.Comment);
                        break;
                    }
                case 45:
                    char cA7 = fgsdVar.a();
                    if (cA7 == 0) {
                        o(fgsxVar);
                        this.h.c((char) 65533);
                        q(fgsx.Comment);
                        break;
                    } else if (cA7 == '-') {
                        q(fgsx.CommentEnd);
                        break;
                    } else if (cA7 == '>') {
                        o(fgsxVar);
                        k();
                        q(fgsx.Data);
                        break;
                    } else if (cA7 == 65535) {
                        n(fgsxVar);
                        k();
                        q(fgsx.Data);
                        break;
                    } else {
                        this.h.c(cA7);
                        q(fgsx.Comment);
                        break;
                    }
                case 46:
                    char cB5 = fgsdVar.b();
                    if (cB5 == 0) {
                        o(fgsxVar);
                        fgsdVar.n();
                        this.h.c((char) 65533);
                        break;
                    } else if (cB5 == '-') {
                        c(fgsx.CommentEndDash);
                        break;
                    } else if (cB5 == 65535) {
                        n(fgsxVar);
                        k();
                        q(fgsx.Data);
                        break;
                    } else {
                        this.h.d(fgsdVar.j('-', 0));
                        break;
                    }
                case 47:
                    char cA8 = fgsdVar.a();
                    if (cA8 == 0) {
                        o(fgsxVar);
                        fgso fgsoVar = this.h;
                        fgsoVar.c('-');
                        fgsoVar.c((char) 65533);
                        q(fgsx.Comment);
                        break;
                    } else if (cA8 == '-') {
                        q(fgsx.CommentEnd);
                        break;
                    } else if (cA8 == 65535) {
                        n(fgsxVar);
                        k();
                        q(fgsx.Data);
                        break;
                    } else {
                        fgso fgsoVar2 = this.h;
                        fgsoVar2.c('-');
                        fgsoVar2.c(cA8);
                        q(fgsx.Comment);
                        break;
                    }
                case 48:
                    char cA9 = fgsdVar.a();
                    if (cA9 == 0) {
                        o(fgsxVar);
                        fgso fgsoVar3 = this.h;
                        fgsoVar3.d("--");
                        fgsoVar3.c((char) 65533);
                        q(fgsx.Comment);
                        break;
                    } else if (cA9 == '!') {
                        q(fgsx.CommentEndBang);
                        break;
                    } else if (cA9 == '-') {
                        this.h.c('-');
                        break;
                    } else if (cA9 == '>') {
                        k();
                        q(fgsx.Data);
                        break;
                    } else if (cA9 == 65535) {
                        n(fgsxVar);
                        k();
                        q(fgsx.Data);
                        break;
                    } else {
                        fgso fgsoVar4 = this.h;
                        fgsoVar4.d("--");
                        fgsoVar4.c(cA9);
                        q(fgsx.Comment);
                        break;
                    }
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    char cA10 = fgsdVar.a();
                    if (cA10 == 0) {
                        o(fgsxVar);
                        fgso fgsoVar5 = this.h;
                        fgsoVar5.d("--!");
                        fgsoVar5.c((char) 65533);
                        q(fgsx.Comment);
                        break;
                    } else if (cA10 == '-') {
                        this.h.d("--!");
                        q(fgsx.CommentEndDash);
                        break;
                    } else if (cA10 == '>') {
                        k();
                        q(fgsx.Data);
                        break;
                    } else if (cA10 == 65535) {
                        n(fgsxVar);
                        k();
                        q(fgsx.Data);
                        break;
                    } else {
                        fgso fgsoVar6 = this.h;
                        fgsoVar6.d("--!");
                        fgsoVar6.c(cA10);
                        q(fgsx.Comment);
                        break;
                    }
                case 50:
                    char cA11 = fgsdVar.a();
                    if (cA11 != '\t' && cA11 != '\n' && cA11 != '\f' && cA11 != '\r' && cA11 != ' ') {
                        if (cA11 != '>') {
                            if (cA11 != 65535) {
                                o(fgsxVar);
                                q(fgsx.BeforeDoctypeName);
                                break;
                            } else {
                                n(fgsxVar);
                            }
                        }
                        o(fgsxVar);
                        e();
                        this.g.e = true;
                        l();
                        q(fgsx.Data);
                        break;
                    } else {
                        q(fgsx.BeforeDoctypeName);
                        break;
                    }
                    break;
                case 51:
                    if (!fgsdVar.z()) {
                        char cA12 = fgsdVar.a();
                        if (cA12 == 0) {
                            o(fgsxVar);
                            e();
                            this.g.a.append((char) 65533);
                            q(fgsx.DoctypeName);
                            break;
                        } else if (cA12 != ' ') {
                            if (cA12 == 65535) {
                                n(fgsxVar);
                                e();
                                this.g.e = true;
                                l();
                                q(fgsx.Data);
                                break;
                            } else if (cA12 != '\t' && cA12 != '\n' && cA12 != '\f' && cA12 != '\r') {
                                e();
                                this.g.a.append(cA12);
                                q(fgsx.DoctypeName);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        e();
                        q(fgsx.DoctypeName);
                        break;
                    }
                    break;
                case 52:
                    if (!fgsdVar.A()) {
                        char cA13 = fgsdVar.a();
                        if (cA13 == 0) {
                            o(fgsxVar);
                            this.g.a.append((char) 65533);
                            break;
                        } else {
                            if (cA13 != ' ') {
                                if (cA13 == '>') {
                                    l();
                                    q(fgsx.Data);
                                    break;
                                } else if (cA13 == 65535) {
                                    n(fgsxVar);
                                    this.g.e = true;
                                    l();
                                    q(fgsx.Data);
                                    break;
                                } else if (cA13 != '\t' && cA13 != '\n' && cA13 != '\f' && cA13 != '\r') {
                                    this.g.a.append(cA13);
                                    break;
                                }
                            }
                            q(fgsx.AfterDoctypeName);
                            break;
                        }
                    } else {
                        this.g.a.append(fgsdVar.h());
                        break;
                    }
                case 53:
                    if (!fgsdVar.t()) {
                        if (!fgsdVar.y('\t', '\n', '\r', '\f', ' ')) {
                            if (!fgsdVar.x('>')) {
                                if (!fgsdVar.w("PUBLIC")) {
                                    if (!fgsdVar.w("SYSTEM")) {
                                        o(fgsxVar);
                                        this.g.e = true;
                                        c(fgsx.BogusDoctype);
                                        break;
                                    } else {
                                        this.g.b = "SYSTEM";
                                        q(fgsx.AfterDoctypeSystemKeyword);
                                        break;
                                    }
                                } else {
                                    this.g.b = "PUBLIC";
                                    q(fgsx.AfterDoctypePublicKeyword);
                                    break;
                                }
                            } else {
                                l();
                                c(fgsx.Data);
                                break;
                            }
                        } else {
                            fgsdVar.n();
                            break;
                        }
                    } else {
                        n(fgsxVar);
                        this.g.e = true;
                        l();
                        q(fgsx.Data);
                        break;
                    }
                case 54:
                    char cA14 = fgsdVar.a();
                    if (cA14 != '\t' && cA14 != '\n' && cA14 != '\f' && cA14 != '\r' && cA14 != ' ') {
                        if (cA14 == '\"') {
                            o(fgsxVar);
                            q(fgsx.DoctypePublicIdentifier_doubleQuoted);
                            break;
                        } else if (cA14 == '\'') {
                            o(fgsxVar);
                            q(fgsx.DoctypePublicIdentifier_singleQuoted);
                            break;
                        } else if (cA14 == '>') {
                            o(fgsxVar);
                            this.g.e = true;
                            l();
                            q(fgsx.Data);
                            break;
                        } else if (cA14 == 65535) {
                            n(fgsxVar);
                            this.g.e = true;
                            l();
                            q(fgsx.Data);
                            break;
                        } else {
                            o(fgsxVar);
                            this.g.e = true;
                            q(fgsx.BogusDoctype);
                            break;
                        }
                    } else {
                        q(fgsx.BeforeDoctypePublicIdentifier);
                        break;
                    }
                    break;
                case 55:
                    char cA15 = fgsdVar.a();
                    if (cA15 != '\t' && cA15 != '\n' && cA15 != '\f' && cA15 != '\r' && cA15 != ' ') {
                        if (cA15 == '\"') {
                            q(fgsx.DoctypePublicIdentifier_doubleQuoted);
                            break;
                        } else if (cA15 == '\'') {
                            q(fgsx.DoctypePublicIdentifier_singleQuoted);
                            break;
                        } else if (cA15 == '>') {
                            o(fgsxVar);
                            this.g.e = true;
                            l();
                            q(fgsx.Data);
                            break;
                        } else if (cA15 == 65535) {
                            n(fgsxVar);
                            this.g.e = true;
                            l();
                            q(fgsx.Data);
                            break;
                        } else {
                            o(fgsxVar);
                            this.g.e = true;
                            q(fgsx.BogusDoctype);
                            break;
                        }
                    } else {
                        break;
                    }
                    break;
                case 56:
                    char cA16 = fgsdVar.a();
                    if (cA16 == 0) {
                        o(fgsxVar);
                        this.g.c.append((char) 65533);
                        break;
                    } else if (cA16 == '\"') {
                        q(fgsx.AfterDoctypePublicIdentifier);
                        break;
                    } else if (cA16 == '>') {
                        o(fgsxVar);
                        this.g.e = true;
                        l();
                        q(fgsx.Data);
                        break;
                    } else if (cA16 == 65535) {
                        n(fgsxVar);
                        this.g.e = true;
                        l();
                        q(fgsx.Data);
                        break;
                    } else {
                        this.g.c.append(cA16);
                        break;
                    }
                case 57:
                    char cA17 = fgsdVar.a();
                    if (cA17 == 0) {
                        o(fgsxVar);
                        this.g.c.append((char) 65533);
                        break;
                    } else if (cA17 == '\'') {
                        q(fgsx.AfterDoctypePublicIdentifier);
                        break;
                    } else if (cA17 == '>') {
                        o(fgsxVar);
                        this.g.e = true;
                        l();
                        q(fgsx.Data);
                        break;
                    } else if (cA17 == 65535) {
                        n(fgsxVar);
                        this.g.e = true;
                        l();
                        q(fgsx.Data);
                        break;
                    } else {
                        this.g.c.append(cA17);
                        break;
                    }
                case 58:
                    char cA18 = fgsdVar.a();
                    if (cA18 != '\t' && cA18 != '\n' && cA18 != '\f' && cA18 != '\r' && cA18 != ' ') {
                        if (cA18 == '\"') {
                            o(fgsxVar);
                            q(fgsx.DoctypeSystemIdentifier_doubleQuoted);
                            break;
                        } else if (cA18 == '\'') {
                            o(fgsxVar);
                            q(fgsx.DoctypeSystemIdentifier_singleQuoted);
                            break;
                        } else if (cA18 == '>') {
                            l();
                            q(fgsx.Data);
                            break;
                        } else if (cA18 == 65535) {
                            n(fgsxVar);
                            this.g.e = true;
                            l();
                            q(fgsx.Data);
                            break;
                        } else {
                            o(fgsxVar);
                            this.g.e = true;
                            q(fgsx.BogusDoctype);
                            break;
                        }
                    } else {
                        q(fgsx.BetweenDoctypePublicAndSystemIdentifiers);
                        break;
                    }
                case 59:
                    char cA19 = fgsdVar.a();
                    if (cA19 != '\t' && cA19 != '\n' && cA19 != '\f' && cA19 != '\r' && cA19 != ' ') {
                        if (cA19 == '\"') {
                            o(fgsxVar);
                            q(fgsx.DoctypeSystemIdentifier_doubleQuoted);
                            break;
                        } else if (cA19 == '\'') {
                            o(fgsxVar);
                            q(fgsx.DoctypeSystemIdentifier_singleQuoted);
                            break;
                        } else if (cA19 == '>') {
                            l();
                            q(fgsx.Data);
                            break;
                        } else if (cA19 == 65535) {
                            n(fgsxVar);
                            this.g.e = true;
                            l();
                            q(fgsx.Data);
                            break;
                        } else {
                            o(fgsxVar);
                            this.g.e = true;
                            q(fgsx.BogusDoctype);
                            break;
                        }
                    } else {
                        break;
                    }
                    break;
                case 60:
                    char cA20 = fgsdVar.a();
                    if (cA20 != '\t' && cA20 != '\n' && cA20 != '\f' && cA20 != '\r' && cA20 != ' ') {
                        if (cA20 == '\"') {
                            o(fgsxVar);
                            q(fgsx.DoctypeSystemIdentifier_doubleQuoted);
                            break;
                        } else if (cA20 == '\'') {
                            o(fgsxVar);
                            q(fgsx.DoctypeSystemIdentifier_singleQuoted);
                            break;
                        } else if (cA20 == '>') {
                            o(fgsxVar);
                            this.g.e = true;
                            l();
                            q(fgsx.Data);
                            break;
                        } else if (cA20 == 65535) {
                            n(fgsxVar);
                            this.g.e = true;
                            l();
                            q(fgsx.Data);
                            break;
                        } else {
                            o(fgsxVar);
                            this.g.e = true;
                            l();
                            break;
                        }
                    } else {
                        q(fgsx.BeforeDoctypeSystemIdentifier);
                        break;
                    }
                    break;
                case 61:
                    char cA21 = fgsdVar.a();
                    if (cA21 != '\t' && cA21 != '\n' && cA21 != '\f' && cA21 != '\r' && cA21 != ' ') {
                        if (cA21 == '\"') {
                            q(fgsx.DoctypeSystemIdentifier_doubleQuoted);
                            break;
                        } else if (cA21 == '\'') {
                            q(fgsx.DoctypeSystemIdentifier_singleQuoted);
                            break;
                        } else if (cA21 == '>') {
                            o(fgsxVar);
                            this.g.e = true;
                            l();
                            q(fgsx.Data);
                            break;
                        } else if (cA21 == 65535) {
                            n(fgsxVar);
                            this.g.e = true;
                            l();
                            q(fgsx.Data);
                            break;
                        } else {
                            o(fgsxVar);
                            this.g.e = true;
                            q(fgsx.BogusDoctype);
                            break;
                        }
                    } else {
                        break;
                    }
                case 62:
                    char cA22 = fgsdVar.a();
                    if (cA22 == 0) {
                        o(fgsxVar);
                        this.g.d.append((char) 65533);
                        break;
                    } else if (cA22 == '\"') {
                        q(fgsx.AfterDoctypeSystemIdentifier);
                        break;
                    } else if (cA22 == '>') {
                        o(fgsxVar);
                        this.g.e = true;
                        l();
                        q(fgsx.Data);
                        break;
                    } else if (cA22 == 65535) {
                        n(fgsxVar);
                        this.g.e = true;
                        l();
                        q(fgsx.Data);
                        break;
                    } else {
                        this.g.d.append(cA22);
                        break;
                    }
                case Function.ALT_CONVENTION /* 63 */:
                    char cA23 = fgsdVar.a();
                    if (cA23 == 0) {
                        o(fgsxVar);
                        this.g.d.append((char) 65533);
                        break;
                    } else if (cA23 == '\'') {
                        q(fgsx.AfterDoctypeSystemIdentifier);
                        break;
                    } else if (cA23 == '>') {
                        o(fgsxVar);
                        this.g.e = true;
                        l();
                        q(fgsx.Data);
                        break;
                    } else if (cA23 == 65535) {
                        n(fgsxVar);
                        this.g.e = true;
                        l();
                        q(fgsx.Data);
                        break;
                    } else {
                        this.g.d.append(cA23);
                        break;
                    }
                case 64:
                    char cA24 = fgsdVar.a();
                    if (cA24 != '\t' && cA24 != '\n' && cA24 != '\f' && cA24 != '\r' && cA24 != ' ') {
                        if (cA24 == '>') {
                            l();
                            q(fgsx.Data);
                            break;
                        } else if (cA24 == 65535) {
                            n(fgsxVar);
                            this.g.e = true;
                            l();
                            q(fgsx.Data);
                            break;
                        } else {
                            o(fgsxVar);
                            q(fgsx.BogusDoctype);
                            break;
                        }
                    } else {
                        break;
                    }
                    break;
                case 65:
                    char cA25 = fgsdVar.a();
                    if (cA25 == '>') {
                        l();
                        q(fgsx.Data);
                        break;
                    } else if (cA25 == 65535) {
                        l();
                        q(fgsx.Data);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    String strB = fgsdVar.B();
                    StringBuilder sb = this.b;
                    sb.append(strB);
                    if (!fgsdVar.v("]]>") && !fgsdVar.t()) {
                        break;
                    } else {
                        j(new fgsm(sb.toString()));
                        q(fgsx.Data);
                        break;
                    }
                    break;
                default:
                    throw null;
            }
        }
        StringBuilder sb2 = this.r;
        if (sb2.length() != 0) {
            String string = sb2.toString();
            sb2.delete(0, sb2.length());
            fgsn fgsnVar = this.f;
            fgsnVar.a = string;
            this.q = null;
            return fgsnVar;
        }
        String str = this.q;
        if (str == null) {
            this.p = false;
            return this.o;
        }
        fgsn fgsnVar2 = this.f;
        fgsnVar2.a = str;
        this.q = null;
        return fgsnVar2;
    }

    final void c(fgsx fgsxVar) {
        q(fgsxVar);
        this.l.n();
    }

    final void d() {
        this.h.a();
    }

    final void e() {
        this.g.a();
    }

    final void f() {
        fgsu.r(this.b);
    }

    final void g(char c) {
        if (this.q == null) {
            this.q = String.valueOf(c);
        } else {
            StringBuilder sb = this.r;
            if (sb.length() == 0) {
                sb.append(this.q);
            }
            sb.append(c);
        }
        this.l.d();
    }

    final void h(String str) {
        if (this.q == null) {
            this.q = str;
        } else {
            StringBuilder sb = this.r;
            if (sb.length() == 0) {
                sb.append(this.q);
            }
            sb.append(str);
        }
        this.l.d();
    }

    final void i(StringBuilder sb) {
        if (this.q == null) {
            this.q = sb.toString();
        } else {
            StringBuilder sb2 = this.r;
            if (sb2.length() == 0) {
                sb2.append(this.q);
            }
            sb2.append((CharSequence) sb);
        }
        this.l.d();
    }

    final void j(fgsu fgsuVar) {
        fgqz.b(this.p);
        this.o = fgsuVar;
        this.p = true;
        this.l.d();
        this.s = -1;
        int i = fgsuVar.h;
        if (i == 2) {
            this.i = ((fgss) fgsuVar).a;
            this.j = null;
        } else if (i == 3) {
            fgsr fgsrVar = (fgsr) fgsuVar;
            if (fgsrVar.p()) {
                p("Attributes incorrectly present on end tag [/%s]", fgsrVar.b);
            }
        }
    }

    final void k() {
        j(this.h);
    }

    final void l() {
        j(this.g);
    }

    final void m() {
        fgst fgstVar = this.e;
        if (fgstVar.e) {
            fgstVar.m();
        }
        j(this.e);
    }

    final void n(fgsx fgsxVar) {
        fgsi fgsiVar = this.m;
        if (fgsiVar.a()) {
            fgsiVar.add(new fgsh(this.l, "Unexpectedly reached end of file (EOF) in input state [%s]", fgsxVar));
        }
    }

    final void o(fgsx fgsxVar) {
        fgsi fgsiVar = this.m;
        if (fgsiVar.a()) {
            fgsd fgsdVar = this.l;
            fgsiVar.add(new fgsh(fgsdVar, "Unexpected character '%s' in input state [%s]", Character.valueOf(fgsdVar.b()), fgsxVar));
        }
    }

    final void p(String str, Object... objArr) {
        fgsi fgsiVar = this.m;
        if (fgsiVar.a()) {
            fgsiVar.add(new fgsh(this.l, str, objArr));
        }
    }

    final void q(fgsx fgsxVar) {
        int iOrdinal = fgsxVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 7) {
                this.l.d();
            }
        } else if (this.s == -1) {
            this.s = this.l.d();
        }
        this.n = fgsxVar;
    }

    final boolean r() {
        return this.i != null && this.e.d().equalsIgnoreCase(this.i);
    }

    final int[] s(Character ch, boolean z) {
        char c;
        char c2;
        char c3;
        int[] iArr;
        int i;
        String strE;
        char c4;
        int iIntValue;
        int i2;
        fgsd fgsdVar = this.l;
        int[] iArr2 = null;
        if (fgsdVar.t()) {
            return null;
        }
        if (ch != null && ch.charValue() == fgsdVar.b()) {
            return null;
        }
        char[] cArr = k;
        fgsdVar.o();
        if (!fgsdVar.t() && Arrays.binarySearch(cArr, fgsdVar.a[fgsdVar.d]) >= 0) {
            return null;
        }
        int[] iArr3 = this.t;
        if (fgsdVar.b - fgsdVar.d < 1024) {
            fgsdVar.c = 0;
        }
        fgsdVar.o();
        fgsdVar.e = fgsdVar.d;
        if (fgsdVar.v("#")) {
            boolean zW = fgsdVar.w("X");
            if (zW) {
                fgsdVar.o();
                int i3 = fgsdVar.d;
                while (true) {
                    i2 = fgsdVar.d;
                    if (i2 >= fgsdVar.b) {
                        iArr = iArr2;
                        break;
                    }
                    char c5 = fgsdVar.a[i2];
                    if (c5 < '0' || c5 > '9') {
                        iArr = iArr2;
                        if ((c5 < 'A' || c5 > 'F') && (c5 < 'a' || c5 > 'f')) {
                            break;
                        }
                    } else {
                        iArr = iArr2;
                    }
                    fgsdVar.d = i2 + 1;
                    iArr2 = iArr;
                }
                strE = fgsd.e(fgsdVar.a, fgsdVar.f, i3, i2 - i3);
            } else {
                iArr = null;
                fgsdVar.o();
                int i4 = fgsdVar.d;
                while (true) {
                    i = fgsdVar.d;
                    if (i >= fgsdVar.b || (c4 = fgsdVar.a[i]) < '0' || c4 > '9') {
                        break;
                    }
                    fgsdVar.d = i + 1;
                }
                strE = fgsd.e(fgsdVar.a, fgsdVar.f, i4, i - i4);
            }
            if (strE.length() == 0) {
                t("numeric reference with no numerals", new Object[0]);
                fgsdVar.q();
                return iArr;
            }
            fgsdVar.s();
            if (!fgsdVar.v(";")) {
                t("missing semicolon on [&#%s]", strE);
            }
            try {
                iIntValue = Integer.valueOf(strE, true != zW ? 10 : 16).intValue();
            } catch (NumberFormatException unused) {
                iIntValue = -1;
            }
            if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                t("character [%s] outside of valid range", Integer.valueOf(iIntValue));
                iArr3[0] = 65533;
            } else {
                if (iIntValue >= 128) {
                    int[] iArr4 = a;
                    if (iIntValue < 160) {
                        t("character [%s] is not a valid unicode code point", Integer.valueOf(iIntValue));
                        iIntValue = iArr4[iIntValue - 128];
                    }
                }
                iArr3[0] = iIntValue;
            }
            return iArr3;
        }
        fgsd fgsdVar2 = this.l;
        fgsdVar2.o();
        int i5 = fgsdVar2.d;
        while (true) {
            int i6 = fgsdVar2.d;
            if (i6 >= fgsdVar2.b || (((c3 = fgsdVar2.a[i6]) < 'A' || c3 > 'Z') && ((c3 < 'a' || c3 > 'z') && !Character.isLetter(c3)))) {
                break;
            }
            fgsdVar2.d++;
        }
        while (!fgsdVar2.u()) {
            char[] cArr2 = fgsdVar2.a;
            int i7 = fgsdVar2.d;
            char c6 = cArr2[i7];
            if (c6 < '0' || c6 > '9') {
                break;
            }
            fgsdVar2.d = i7 + 1;
        }
        String strE2 = fgsd.e(fgsdVar2.a, fgsdVar2.f, i5, fgsdVar2.d - i5);
        boolean zX = fgsdVar2.x(';');
        char[] cArr3 = fgru.a;
        if (fgrt.base.a(strE2) == -1) {
            if (fgrt.extended.a(strE2) != -1) {
                if (!zX) {
                    zX = false;
                }
            }
            fgsdVar2.q();
            if (zX) {
                t("invalid named reference [%s]", strE2);
            }
            return null;
        }
        if (z && (fgsdVar2.A() || ((!fgsdVar2.t() && (c2 = fgsdVar2.a[fgsdVar2.d]) >= '0' && c2 <= '9') || fgsdVar2.y('=', '-', '_')))) {
            fgsdVar2.q();
            return null;
        }
        fgsdVar2.s();
        if (!fgsdVar2.v(";")) {
            t("missing semicolon on [&%s]", strE2);
        }
        int[] iArr5 = this.u;
        String str = (String) fgru.b.get(strE2);
        if (str != null) {
            iArr5[0] = str.codePointAt(0);
            iArr5[1] = str.codePointAt(1);
            c = 2;
        } else {
            int iA = fgrt.extended.a(strE2);
            if (iA != -1) {
                iArr5[0] = iA;
                c = 1;
            } else {
                c = 0;
            }
        }
        if (c == 1) {
            iArr3[0] = iArr5[0];
            return iArr3;
        }
        if (c == 2) {
            return iArr5;
        }
        fgqz.a("Unexpected characters returned for ".concat(strE2));
        return iArr5;
    }
}
