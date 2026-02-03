package defpackage;

import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azqp implements aytd {
    private final cogw a;

    public azqp(cogw cogwVar) {
        cogwVar.getClass();
        this.a = cogwVar;
    }

    @Override // defpackage.aytd
    public final void a() {
        String[] strArr = azqo.a;
        azqg azqgVar = new azqg();
        azqgVar.f("BackupMetadataTableWriter");
        azqgVar.e();
        azqgVar.b().b();
    }

    @Override // defpackage.aytd
    public final void b(aytc aytcVar) {
        aytcVar.getClass();
        String[] strArr = azqo.a;
        azpr azprVar = new azpr();
        azprVar.c(this.a.f());
        azprVar.b(UUID.randomUUID().toString());
        azprVar.d(150);
        azpm azpmVarA = azprVar.a(new Supplier() { // from class: azpp
            @Override // java.util.function.Supplier
            public final Object get() {
                return new azpn();
            }
        });
        final dqsy dqsyVarA = azqo.a();
        dqru.b(azqo.a(), "backup_metadata", azpmVarA, new Function() { // from class: azpk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarA.P("backup_metadata", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: azpl
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
