package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daru implements bmgk {
    private final fcsu a;
    private final eksp b;
    private final AtomicBoolean c;
    private final bxiq d;
    private brdp e;

    public daru(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        this.b = eksp.c("BugleJobs");
        this.c = new AtomicBoolean(false);
        this.d = new bxiq(((bxir) fcsuVar.b()).a);
    }

    @Override // defpackage.bmgk
    public final void a() {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("SyncDataToWearableMessageChangeObserver-messages");
        brdrVarD.e(new Function() { // from class: dart
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bran branVar = (bran) obj;
                branVar.getClass();
                return new brao[]{branVar.a, branVar.n, branVar.k};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.e = brdrVarD.b();
    }

    @Override // defpackage.bmgk
    public final void fZ() {
        if (!this.c.compareAndSet(false, true)) {
            ((eksl) this.b.h()).q("Already started sync data to wearable message observer.");
            return;
        }
        ((eksl) this.b.h()).q("Starting sync data to wearable message observer.");
        brdp brdpVar = this.e;
        if (brdpVar == null) {
            fdbq.c("messageQuery");
            brdpVar = null;
        }
        brdpVar.M(this.d);
    }
}
