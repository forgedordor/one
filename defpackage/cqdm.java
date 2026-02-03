package defpackage;

import android.text.TextUtils;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqdm {
    private final fcsu a;
    private final fcsu b;

    public cqdm(fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    private final String b(badt badtVar) {
        String strO = badtVar.o();
        String str = (String) badtVar.k().map(new Function() { // from class: cqdl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cczv cczvVar = alvx.a;
                return ((alqm) obj).p(((Boolean) new alvu().get()).booleanValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null);
        if (true == TextUtils.isEmpty(strO)) {
            strO = str;
        }
        return ((cssf) this.a.b()).d(ejwk.b(strO));
    }

    public final boolean a(badt badtVar) {
        return ((asbv) this.b.b()).a() ? !TextUtils.isEmpty(b(badtVar)) && badtVar.v() && (!TextUtils.isEmpty(badtVar.p()) || badtVar.Q()) && !badtVar.z() && !badtVar.P() && badtVar.K() == bvdk.UNARCHIVED : (TextUtils.isEmpty(b(badtVar)) || !badtVar.v() || TextUtils.isEmpty(badtVar.p()) || badtVar.z() || badtVar.P() || badtVar.K() != bvdk.UNARCHIVED) ? false : true;
    }
}
