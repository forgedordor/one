package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.function.Function$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxip implements bmgk {
    public static final /* synthetic */ int b = 0;
    private static final eksp c = eksp.c("BugleJobs");
    public final fcsu a;
    private final bxio d = new bxio(this);
    private final AtomicBoolean e = new AtomicBoolean(false);
    private Supplier f;

    public bxip(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    @Override // defpackage.bmgk
    public final void a() {
        final ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: bxij
            @Override // defpackage.ejxr
            public final Object get() {
                int i = bxip.b;
                String[] strArr = VmtTable.a;
                bvcy bvcyVar = new bvcy(VmtTable.a);
                bvcyVar.A("VmtTableChangeObserver-transcriptions");
                bvcyVar.d(new Function() { // from class: bxih
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bvcm bvcmVar = (bvcm) obj;
                        int i2 = bxip.b;
                        return new bvcn[]{bvcmVar.a, bvcmVar.b};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bvcyVar.e(new Function() { // from class: bxii
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bvdc bvdcVar = (bvdc) obj;
                        int i2 = bxip.b;
                        bvdcVar.c(aonp.VMT_STATUS_COMPLETE);
                        return bvdcVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return bvcyVar.b();
            }
        });
        ejxrVarA.getClass();
        this.f = new Supplier() { // from class: bxik
            @Override // java.util.function.Supplier
            public final Object get() {
                return (bvcx) ejxrVarA.get();
            }
        };
    }

    @Override // defpackage.bmgk
    public final void fZ() {
        if (this.e.compareAndSet(false, true)) {
            ((bvcx) this.f.get()).M(this.d);
        } else {
            ((eksl) ((eksl) c.j()).h("com/google/android/apps/messaging/shared/datamodel/observer/VmtTableContentChangeObserver", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 77, "VmtTableContentChangeObserver.java")).q("Already started vmt table content change observer.");
        }
    }
}
