package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_LocationInformation;
import com.google.android.rcs.client.messaging.data.LocationInformation;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class efjp {
    public abstract LocationInformation a();

    public abstract void b(String str);

    public abstract void c(Instant instant);

    public abstract void d(String str);

    public abstract void e(String str);

    public abstract void f(double d);

    public abstract void g(double d);

    public abstract void h(double d);

    public abstract void i(Instant instant);

    public final LocationInformation j() {
        LocationInformation locationInformationA = a();
        AutoValue_LocationInformation autoValue_LocationInformation = (AutoValue_LocationInformation) locationInformationA;
        double d = autoValue_LocationInformation.b;
        ejwl.m(d >= -180.0d && d <= 180.0d, "Latitude must be between -180 and 180.");
        double d2 = autoValue_LocationInformation.a;
        ejwl.m(d2 >= -180.0d && d2 <= 180.0d, "Longitude must be between -180 and 180.");
        autoValue_LocationInformation.c.ifPresent(new Consumer() { // from class: efjo
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ejwl.m(((Double) obj).doubleValue() >= 0.0d, "Radius must be non-negative.");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return locationInformationA;
    }
}
