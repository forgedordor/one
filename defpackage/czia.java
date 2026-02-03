package defpackage;

import android.content.Context;
import android.hardware.Camera;
import android.view.OrientationEventListener;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czia extends OrientationEventListener {
    final /* synthetic */ czib a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czia(czib czibVar, Context context) {
        super(context, 3);
        this.a = czibVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        if (i == -1) {
            return;
        }
        int iRound = (int) Math.round(i / 90.0d);
        czib czibVar = this.a;
        final int i2 = (360 - (iRound * 90)) % 360;
        if (czibVar.p && i2 == czibVar.n && czibVar.o == czibVar.a()) {
            return;
        }
        czibVar.f(new Consumer() { // from class: czhz
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                this.a.a.t((Camera) obj, i2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
