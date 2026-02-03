package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abap extends abai {
    private final Context g;
    private final crny h;

    public abap(abag abagVar, Context context, crny crnyVar) {
        super(abagVar, "SIM Card Present");
        this.g = context;
        this.h = crnyVar;
    }

    @Override // defpackage.abai
    public final abaj a() {
        return this.h.r() ? abaj.a : new abaj(5, Collections.singletonList(this.g.getString(R.string.insert_sim_suggestion)));
    }
}
