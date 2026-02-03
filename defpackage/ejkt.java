package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ejkt {
    public abstract euob a(int i, ejha ejhaVar);

    public final euob b(int i, ejha ejhaVar) throws ejkv {
        int i2 = i - 1;
        if (i2 == 1) {
            return a(1, ejhaVar);
        }
        if (i2 == 2) {
            return a(2, ejhaVar);
        }
        throw new ejkv("PredictorFactory: unrecognized predictor type.");
    }
}
