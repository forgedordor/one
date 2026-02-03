package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import com.sun.jna.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgkh {
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0092, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(defpackage.fgme r8) {
        /*
            boolean r0 = r8.j()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 60
            boolean r2 = r8.k(r0)
            r3 = 92
            r4 = 1
            if (r2 == 0) goto L43
        L13:
            boolean r2 = r8.j()
            if (r2 == 0) goto L42
            char r2 = r8.a()
            r5 = 10
            if (r2 == r5) goto L42
            if (r2 == r0) goto L42
            r5 = 62
            if (r2 == r5) goto L3e
            if (r2 == r3) goto L2d
            r8.h()
            goto L13
        L2d:
            r8.h()
            char r2 = r8.a()
            boolean r2 = d(r2)
            if (r2 == 0) goto L13
            r8.h()
            goto L13
        L3e:
            r8.h()
            return r4
        L42:
            return r1
        L43:
            r2 = r1
            r0 = r4
        L45:
            boolean r5 = r8.j()
            if (r5 == 0) goto L92
            char r5 = r8.a()
            r6 = 32
            if (r5 == r6) goto L8f
            if (r5 == r3) goto L7d
            r7 = 40
            if (r5 == r7) goto L74
            r6 = 41
            if (r5 == r6) goto L6b
            boolean r5 = java.lang.Character.isISOControl(r5)
            if (r5 == 0) goto L67
            if (r0 == 0) goto L66
            return r1
        L66:
            return r4
        L67:
            r8.h()
            goto L8d
        L6b:
            if (r2 != 0) goto L6e
            return r4
        L6e:
            r8.h()
            int r2 = r2 + (-1)
            goto L8d
        L74:
            int r2 = r2 + 1
            if (r2 <= r6) goto L79
            return r1
        L79:
            r8.h()
            goto L8d
        L7d:
            r8.h()
            char r0 = r8.a()
            boolean r0 = d(r0)
            if (r0 == 0) goto L8d
            r8.h()
        L8d:
            r0 = r1
            goto L45
        L8f:
            if (r0 == 0) goto L92
            return r1
        L92:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgkh.a(fgme):boolean");
    }

    public static boolean b(fgme fgmeVar) {
        while (fgmeVar.j()) {
            switch (fgmeVar.a()) {
                case '[':
                    return false;
                case '\\':
                    fgmeVar.h();
                    if (!d(fgmeVar.a())) {
                        break;
                    } else {
                        fgmeVar.h();
                        break;
                    }
                case ']':
                    return true;
                default:
                    fgmeVar.h();
                    break;
            }
        }
        return true;
    }

    public static boolean c(fgme fgmeVar, char c) {
        while (fgmeVar.j()) {
            char cA = fgmeVar.a();
            if (cA == '\\') {
                fgmeVar.h();
                if (d(fgmeVar.a())) {
                    fgmeVar.h();
                }
            } else {
                if (cA == c) {
                    return true;
                }
                if (c == ')' && cA == '(') {
                    return false;
                }
                fgmeVar.h();
            }
        }
        return true;
    }

    private static boolean d(char c) {
        switch (c) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case Maneuver.TYPE_DESTINATION /* 39 */:
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
                return true;
            default:
                switch (c) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case Function.ALT_CONVENTION /* 63 */:
                    case '@':
                        return true;
                    default:
                        switch (c) {
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                                return true;
                            default:
                                switch (c) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }
}
