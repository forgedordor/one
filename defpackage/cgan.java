package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cgan implements cgbf {
    private final cgbf a;

    protected cgan(cgbf cgbfVar) {
        this.a = cgbfVar;
    }

    @Override // defpackage.cgbf
    public final /* synthetic */ int a() {
        return cgbd.a(this);
    }

    @Override // defpackage.cgbf
    public Notification b() {
        throw null;
    }

    @Override // defpackage.cgbf
    public final cgbe c() {
        return ((cgay) this.a).b;
    }

    @Override // defpackage.cgbf
    public String d() {
        return null;
    }

    public final String o() {
        Function function = new Function() { // from class: cgax
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cgda) obj).a();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        cgay cgayVar = (cgay) this.a;
        NotificationChannel notificationChannelM = akc$$ExternalSyntheticApiModelOutline0.m(cgayVar.d.map(function).orElse(cgayVar.a.g()));
        return notificationChannelM == null ? "" : notificationChannelM.getId();
    }

    public final String toString() {
        return String.format(Locale.US, "%s (id: %s, tag: %s)", ((cgay) this.a).c, c(), d());
    }
}
