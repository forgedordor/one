package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qku extends fdbr implements fdae {
    final /* synthetic */ qee a;
    final /* synthetic */ UUID b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qku(qee qeeVar, UUID uuid) {
        super(0);
        this.a = qeeVar;
        this.b = uuid;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        final qee qeeVar = this.a;
        WorkDatabase workDatabase = qeeVar.e;
        workDatabase.getClass();
        final UUID uuid = this.b;
        workDatabase.p(new Runnable() { // from class: qkt
            @Override // java.lang.Runnable
            public final void run() {
                String string = uuid.toString();
                string.getClass();
                qky.b(qeeVar, string);
            }
        });
        qky.d(qeeVar);
        return fctx.a;
    }
}
