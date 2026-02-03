package defpackage;

import android.app.ActivityOptions;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kum extends kun {
    private final ActivityOptions a;

    public kum(ActivityOptions activityOptions) {
        this.a = activityOptions;
    }

    @Override // defpackage.kun
    public final Bundle a() {
        return this.a.toBundle();
    }
}
