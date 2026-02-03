package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbld implements aymj {
    final /* synthetic */ CountDownLatch a;

    public bbld(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    @Override // defpackage.aymj
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.a.countDown();
    }

    @Override // defpackage.aymj
    public final /* bridge */ /* synthetic */ void b(Action action, Object obj) {
        this.a.countDown();
    }
}
