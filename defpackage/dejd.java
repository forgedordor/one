package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dejd {
    public static defn a(defn defnVar) {
        if (!defnVar.l()) {
            throw new IllegalArgumentException("Task is not complete:".concat(defnVar.toString()));
        }
        if (defnVar.m()) {
            throw new IllegalArgumentException("Task is successful:".concat(defnVar.toString()));
        }
        if (!((defv) defnVar).d) {
            Exception excH = defnVar.h();
            return excH != null ? degc.b(excH) : degc.b(new IllegalStateException("Task was not successful or canceled, but exception is null"));
        }
        defv defvVar = new defv();
        defvVar.x();
        return defvVar;
    }
}
