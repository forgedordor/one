package defpackage;

import android.content.Intent;
import android.net.Uri;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwwa extends bajr {
    final /* synthetic */ cwwb a;

    public cwwa(cwwb cwwbVar) {
        this.a = cwwbVar;
    }

    @Override // defpackage.bajr
    public final long a() {
        return -1L;
    }

    @Override // defpackage.bajr
    public final long b() {
        return -1L;
    }

    @Override // defpackage.bajr
    public final Intent c() {
        return null;
    }

    @Override // defpackage.bajr
    public final Uri d() {
        badt badtVar = this.a.s;
        if (badtVar.n() == null) {
            return null;
        }
        return Uri.parse(badtVar.n());
    }

    @Override // defpackage.bajr
    public final Optional e() {
        return Optional.empty();
    }

    @Override // defpackage.bajr
    public final Optional k() {
        return Optional.empty();
    }

    @Override // defpackage.bajr
    public final String l() {
        badt badtVar = this.a.s;
        String strO = badtVar.o();
        String str = (String) badtVar.k().map(new Function() { // from class: cwvz
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
        if (str == null || str.equals(strO) || !badtVar.v()) {
            return null;
        }
        if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && str.equals("+18339913448")) {
            return null;
        }
        return str;
    }

    @Override // defpackage.bajr
    public final String m() {
        return this.a.s.o();
    }

    @Override // defpackage.bajr
    public final String n() {
        return null;
    }
}
