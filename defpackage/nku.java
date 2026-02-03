package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nku implements mdb {
    private final mcy a = new nkt();

    @Override // defpackage.mdb
    public final mdd a(Context context, mag magVar, maj majVar, mdc mdcVar, Executor executor, mcv mcvVar, List list, boolean z) {
        try {
            return ((mdb) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(mcy.class).newInstance(this.a)).a(context, magVar, majVar, mdcVar, executor, mcvVar, list, z);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
