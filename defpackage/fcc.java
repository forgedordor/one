package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class fcc extends fdbo implements fdap {
    public fcc(Object obj) {
        super(1, obj, fcb.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        final ezt eztVarA;
        Integer numValueOf;
        KeyEvent keyEvent = ((iqh) obj).a;
        final fcb fcbVar = (fcb) this.g;
        boolean z = true;
        kde kdeVar = null;
        if (keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) {
            ezi eziVar = fcbVar.i;
            int unicodeChar = keyEvent.getUnicodeChar();
            if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                eziVar.a = Integer.valueOf(unicodeChar & Alert.DURATION_SHOW_INDEFINITELY);
                numValueOf = null;
            } else {
                Integer num = eziVar.a;
                if (num != null) {
                    eziVar.a = null;
                    Integer numValueOf2 = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar));
                    if (numValueOf2.intValue() == 0) {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null) {
                        unicodeChar = numValueOf2.intValue();
                    }
                    numValueOf = Integer.valueOf(unicodeChar);
                } else {
                    numValueOf = Integer.valueOf(unicodeChar);
                }
            }
            if (numValueOf != null) {
                kdeVar = new kde(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
            }
        }
        if (kdeVar != null) {
            boolean z2 = fcbVar.d;
            fcbVar.a(kdeVar);
            fcbVar.f.a();
        } else if (iqi.a(iqj.a(keyEvent), 2) && (eztVarA = fcbVar.j.a(keyEvent)) != null) {
            if (eztVarA.W) {
                boolean z3 = fcbVar.d;
            }
            final fdce fdceVar = new fdce();
            fdceVar.a = true;
            fdap fdapVar = new fdap() { // from class: fca
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    fdx fdxVar;
                    fdce fdceVar2 = fdceVar;
                    fme fmeVar = (fme) obj2;
                    fcb fcbVar2 = fcbVar;
                    kew kewVar = null;
                    switch (eztVarA.ordinal()) {
                        case 0:
                            fdap fdapVar2 = new fdap() { // from class: fbs
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj3) {
                                    ((fme) obj3).k();
                                    return fctx.a;
                                }
                            };
                            fmeVar.b.a();
                            if (fmeVar.f().length() > 0) {
                                if (!jyo.i(fmeVar.c)) {
                                    if (!fmeVar.h()) {
                                        int iC = jyo.c(fmeVar.c);
                                        fmeVar.g(iC, iC);
                                        break;
                                    } else {
                                        int iD = jyo.d(fmeVar.c);
                                        fmeVar.g(iD, iD);
                                        break;
                                    }
                                } else {
                                    fdapVar2.invoke(fmeVar);
                                    break;
                                }
                            }
                            break;
                        case 1:
                            fdap fdapVar3 = new fdap() { // from class: fbt
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj3) {
                                    ((fme) obj3).o();
                                    return fctx.a;
                                }
                            };
                            fmeVar.b.a();
                            if (fmeVar.f().length() > 0) {
                                if (!jyo.i(fmeVar.c)) {
                                    if (!fmeVar.h()) {
                                        int iD2 = jyo.d(fmeVar.c);
                                        fmeVar.g(iD2, iD2);
                                        break;
                                    } else {
                                        int iC2 = jyo.c(fmeVar.c);
                                        fmeVar.g(iC2, iC2);
                                        break;
                                    }
                                } else {
                                    fdapVar3.invoke(fmeVar);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            fmeVar.p();
                            break;
                        case 3:
                            fmeVar.l();
                            break;
                        case 4:
                            fmeVar.m();
                            break;
                        case 5:
                            fmeVar.n();
                            break;
                        case 6:
                            fmeVar.v();
                            break;
                        case 7:
                            fmeVar.s();
                            break;
                        case 8:
                            fmeVar.t();
                            break;
                        case 9:
                            fmeVar.u();
                            break;
                        case 10:
                            fmeVar.w();
                            break;
                        case 11:
                            fmeVar.j();
                            break;
                        case 12:
                            fmeVar.A();
                            break;
                        case 13:
                            fmeVar.z();
                            break;
                        case 14:
                            fmeVar.r();
                            break;
                        case 15:
                            fmeVar.q();
                            break;
                        case 16:
                            fcbVar2.b.H(false);
                            break;
                        case 17:
                            fcbVar2.b.G();
                            break;
                        case 18:
                            fcbVar2.b.D();
                            break;
                        case 19:
                            List listY = fmeVar.y(new fdap() { // from class: fbu
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj3) {
                                    int iA;
                                    int iD3;
                                    fme fmeVar2 = (fme) obj3;
                                    String str = fmeVar2.d.b;
                                    int iA2 = jyo.a(fmeVar2.c);
                                    if (iA2 <= 0) {
                                        iD3 = -1;
                                    } else {
                                        lpz lpzVarC = fba.c();
                                        iD3 = (lpzVarC != null && (iA = lpzVarC.a(str, iA2 + (-1))) >= 0) ? iA : fba.d(str, iA2);
                                    }
                                    if (iD3 == -1) {
                                        return null;
                                    }
                                    return new kdk(jyo.a(fmeVar2.c) - iD3, 0);
                                }
                            });
                            if (listY != null) {
                                fcbVar2.b(listY);
                                break;
                            }
                            break;
                        case 20:
                            List listY2 = fmeVar.y(new fdap() { // from class: fbv
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj3) {
                                    fme fmeVar2 = (fme) obj3;
                                    int iA = fmeVar2.a();
                                    if (iA != -1) {
                                        return new kdk(0, iA - jyo.a(fmeVar2.c));
                                    }
                                    return null;
                                }
                            });
                            if (listY2 != null) {
                                fcbVar2.b(listY2);
                                break;
                            }
                            break;
                        case 21:
                            List listY3 = fmeVar.y(new fdap() { // from class: fbw
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj3) {
                                    fme fmeVar2 = (fme) obj3;
                                    Integer numE = fmeVar2.e();
                                    if (numE == null) {
                                        return null;
                                    }
                                    return new kdk(jyo.a(fmeVar2.c) - numE.intValue(), 0);
                                }
                            });
                            if (listY3 != null) {
                                fcbVar2.b(listY3);
                                break;
                            }
                            break;
                        case 22:
                            List listY4 = fmeVar.y(new fdap() { // from class: fbx
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj3) {
                                    fme fmeVar2 = (fme) obj3;
                                    Integer numD = fmeVar2.d();
                                    if (numD != null) {
                                        return new kdk(0, numD.intValue() - jyo.a(fmeVar2.c));
                                    }
                                    return null;
                                }
                            });
                            if (listY4 != null) {
                                fcbVar2.b(listY4);
                                break;
                            }
                            break;
                        case 23:
                            List listY5 = fmeVar.y(new fdap() { // from class: fby
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj3) {
                                    fme fmeVar2 = (fme) obj3;
                                    Integer numC = fmeVar2.c();
                                    if (numC == null) {
                                        return null;
                                    }
                                    return new kdk(jyo.a(fmeVar2.c) - numC.intValue(), 0);
                                }
                            });
                            if (listY5 != null) {
                                fcbVar2.b(listY5);
                                break;
                            }
                            break;
                        case 24:
                            List listY6 = fmeVar.y(new fdap() { // from class: fbz
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj3) {
                                    fme fmeVar2 = (fme) obj3;
                                    Integer numB = fmeVar2.b();
                                    if (numB != null) {
                                        return new kdk(0, numB.intValue() - jyo.a(fmeVar2.c));
                                    }
                                    return null;
                                }
                            });
                            if (listY6 != null) {
                                fcbVar2.b(listY6);
                                break;
                            }
                            break;
                        case 25:
                            fmeVar.b.a();
                            if (fmeVar.f().length() > 0) {
                                fmeVar.g(0, fmeVar.f().length());
                                break;
                            }
                            break;
                        case 26:
                            fmeVar.k();
                            fmeVar.i();
                            break;
                        case 27:
                            fmeVar.o();
                            fmeVar.i();
                            break;
                        case 28:
                            fmeVar.w();
                            fmeVar.i();
                            break;
                        case 29:
                            fmeVar.j();
                            fmeVar.i();
                            break;
                        case 30:
                            fmeVar.A();
                            fmeVar.i();
                            break;
                        case 31:
                            fmeVar.z();
                            fmeVar.i();
                            break;
                        case 32:
                            fmeVar.r();
                            fmeVar.i();
                            break;
                        case 33:
                            fmeVar.q();
                            fmeVar.i();
                            break;
                        case 34:
                            fmeVar.l();
                            fmeVar.i();
                            break;
                        case 35:
                            fmeVar.p();
                            fmeVar.i();
                            break;
                        case 36:
                            fmeVar.m();
                            fmeVar.i();
                            break;
                        case 37:
                            fmeVar.n();
                            fmeVar.i();
                            break;
                        case 38:
                            fmeVar.v();
                            fmeVar.i();
                            break;
                        case Maneuver.TYPE_DESTINATION /* 39 */:
                            fmeVar.s();
                            fmeVar.i();
                            break;
                        case 40:
                            fmeVar.t();
                            fmeVar.i();
                            break;
                        case 41:
                            fmeVar.u();
                            fmeVar.i();
                            break;
                        case 42:
                            fmeVar.b.a();
                            if (fmeVar.f().length() > 0) {
                                int iA = jyo.a(fmeVar.c);
                                fmeVar.g(iA, iA);
                                break;
                            }
                            break;
                        case 43:
                            if (!fcbVar2.e) {
                                fcbVar2.a(new kde("\n", 1));
                                break;
                            } else {
                                fdceVar2.a = ((Boolean) fcbVar2.a.r.invoke(new kdw(fcbVar2.l))).booleanValue();
                                break;
                            }
                        case 44:
                            if (!fcbVar2.e) {
                                fcbVar2.a(new kde("\t", 1));
                                break;
                            } else {
                                fdceVar2.a = false;
                                break;
                            }
                        case 45:
                            fdy fdyVar = fcbVar2.h;
                            if (fdyVar != null) {
                                fdyVar.b(fmeVar.x());
                            }
                            if (fdyVar != null) {
                                fdx fdxVar2 = fdyVar.a;
                                if (fdxVar2 != null && (fdxVar = fdxVar2.a) != null) {
                                    fdyVar.a = fdxVar;
                                    fdyVar.c -= fdxVar2.b.a().length();
                                    fdyVar.b = new fdx(fdyVar.b, fdxVar2.b);
                                    kewVar = fdxVar.b;
                                }
                                if (kewVar != null) {
                                    fcbVar2.k.invoke(kewVar);
                                    break;
                                }
                            }
                            break;
                        case 46:
                            fdy fdyVar2 = fcbVar2.h;
                            if (fdyVar2 != null) {
                                fdx fdxVar3 = fdyVar2.b;
                                if (fdxVar3 != null) {
                                    fdyVar2.b = fdxVar3.a;
                                    kew kewVar2 = fdxVar3.b;
                                    fdyVar2.a = new fdx(fdyVar2.a, kewVar2);
                                    fdyVar2.c += kewVar2.a().length();
                                    kewVar = fdxVar3.b;
                                }
                                if (kewVar != null) {
                                    fcbVar2.k.invoke(kewVar);
                                    break;
                                }
                            }
                            break;
                        case 47:
                            break;
                        default:
                            throw new fctg();
                    }
                    return fctx.a;
                }
            };
            kew kewVar = fcbVar.c;
            fme fmeVar = new fme(kewVar, fcbVar.g, fcbVar.a.d(), fcbVar.f);
            fdapVar.invoke(fmeVar);
            if (!jyo.h(fmeVar.c, kewVar.c) || !fdbq.f(fmeVar.d, kewVar.b)) {
                fcbVar.k.invoke(fmeVar.x());
            }
            fdy fdyVar = fcbVar.h;
            if (fdyVar != null) {
                fdyVar.a();
            }
            z = fdceVar.a;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
