package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.user.profile.photopicker.edit.EditActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edut {
    private final Activity a;
    private final ednk b;

    public edut(Activity activity, ednk ednkVar) {
        this.a = activity;
        this.b = ednkVar;
    }

    public final void a(Uri uri) {
        Activity activity = this.b.a;
        this.a.startActivityForResult(new Intent(activity, (Class<?>) EditActivity.class).putExtras(activity.getIntent()).setData(uri), 10000);
    }
}
