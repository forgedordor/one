package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class einw extends Exception {
    private final ekgb a;

    /* JADX WARN: Multi-variable type inference failed */
    public einw(ekgb ekgbVar) {
        super((Throwable) ekgbVar.get(0));
        this.a = ekgbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ekjz.h(this.a, ((einw) obj).a);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String strValueOf = String.valueOf(getCause());
        ekgb ekgbVar = this.a;
        return "Combined exception with " + ((ekoe) ekgbVar).c + " cause(s). First cause: " + strValueOf + " All: " + String.valueOf(ekgbVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
