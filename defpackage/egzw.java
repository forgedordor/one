package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class egzw {
    public static final egzv f = new egzv<Object>() { // from class: egzw.1
        @Override // defpackage.egzv
        public final void a(Throwable th) {
            throw new IllegalStateException("Empty callbacks received a callback.");
        }

        @Override // defpackage.egzv
        public final void b(Object obj) {
            throw new IllegalStateException("Empty callbacks received a callback.");
        }

        @Override // defpackage.egzv
        public final void hn() {
            throw new IllegalStateException("Empty callbacks received a callback.");
        }
    };

    public abstract long a();

    public abstract egzv b();

    public abstract ejwi c();

    public abstract ejwi d();

    public abstract boolean e();

    final egzw f(egyy egyyVar) {
        return new egye(a(), b(), e(), ejwi.j(egyyVar), ejwi.j(egyyVar));
    }

    final egzw g(boolean z) {
        ejwl.m(b() instanceof egyf, "Non-BackgroundFetchCallbacks shouldn't be mutating around background fetch callbacks.");
        ejwl.m(z != e(), "Double-open or double-close on background fetch callbacks.");
        return new egye(a(), b(), z, d(), c());
    }
}
