package defpackage;

import android.content.Context;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mni implements mdb {
    private final mcy a;

    public mni(mcy mcyVar) {
        this.a = mcyVar;
    }

    @Override // defpackage.mdb
    public final /* bridge */ /* synthetic */ mdd a(Context context, mag magVar, maj majVar, mdc mdcVar, Executor executor, mcv mcvVar, List list, boolean z) {
        return new mnk(context, this.a, magVar, majVar, mdcVar, executor, list, z);
    }

    public mni() {
        this(new DefaultVideoFrameProcessor$Factory.Builder().build());
    }
}
