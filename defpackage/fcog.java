package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcog {
    public static final fbsr a(final fcyh fcyhVar, fbrk fbrkVar, final fdap fdapVar) {
        return new fbsr(fbrkVar, new fbsn() { // from class: fcnr
            @Override // defpackage.fbsn
            public final fbsl a(final fbsm fbsmVar, fbrg fbrgVar) {
                Object objA = fcni.a.a();
                objA.getClass();
                fcyh fcyhVarPlus = fcyhVar.plus((fcyh) objA);
                fbog fbogVarK = fbog.k();
                fbogVarK.getClass();
                fcyh fcyhVarPlus2 = fcyhVarPlus.plus(new fcnk(fbogVarK));
                fcnq fcnqVar = new fcnq(new fdae() { // from class: fcnt
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return Boolean.valueOf(fbsmVar.h());
                    }
                });
                fdoa fdoaVarA = fdod.a(1, 0, 6);
                return new fcnv(fdil.d(fdjy.b(fcyhVarPlus2), null, null, new fcnz(fdapVar, new fdui(new fcnw(new AtomicBoolean(false), fbsmVar, fdoaVarA, null)), fcnqVar, fbsmVar, null), 3), fdoaVarA, fbsmVar, fcnqVar);
            }
        });
    }

    public static final fbsr b(fcyh fcyhVar, final fbrk fbrkVar, final fdap fdapVar) {
        if (fbrkVar.a == fbrj.SERVER_STREAMING) {
            return a(fcyhVar, fbrkVar, new fdap() { // from class: fcnu
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    fdpl fdplVar = (fdpl) obj;
                    fdplVar.getClass();
                    return new fdui(new fcoc(fdplVar, fbrkVar, fdapVar, null));
                }
            });
        }
        Objects.toString(fbrkVar);
        throw new IllegalArgumentException("Expected a server streaming method descriptor but got ".concat(fbrkVar.toString()));
    }

    public static final fbsr c(fcyh fcyhVar, final fbrk fbrkVar, final fdat fdatVar) {
        if (fbrkVar.a == fbrj.UNARY) {
            return a(fcyhVar, fbrkVar, new fdap() { // from class: fcns
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    fdpl fdplVar = (fdpl) obj;
                    fdplVar.getClass();
                    return new fcof(fcnn.a(fdplVar, fbrkVar), fdatVar);
                }
            });
        }
        Objects.toString(fbrkVar);
        throw new IllegalArgumentException("Expected a unary method descriptor but got ".concat(fbrkVar.toString()));
    }
}
