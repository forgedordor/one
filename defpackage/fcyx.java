package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fcyx extends fcyt {
    public fcyx(fcxy fcxyVar) {
        super(fcxyVar);
        if (fcxyVar != null && fcxyVar.u() != fcyi.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // defpackage.fcxy
    public final fcyh u() {
        return fcyi.a;
    }
}
