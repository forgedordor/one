package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import androidx.preference.Preference;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cutw implements ozb {
    final /* synthetic */ Context a;
    final /* synthetic */ cuty b;

    public cutw(cuty cutyVar, Context context) {
        this.a = context;
        this.b = cutyVar;
    }

    @Override // defpackage.ozb
    public final boolean a(Preference preference) throws IOException {
        try {
            Context context = this.a;
            eiid.o(context, this.b.N.q(context));
            return true;
        } catch (ActivityNotFoundException e) {
            cqca.h("Bugle", e, "Failed to launch wireless alerts activity");
            return true;
        }
    }
}
