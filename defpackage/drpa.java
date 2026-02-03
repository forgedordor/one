package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drpa implements dror {
    private final List a;
    private final SharedPreferences b;
    private final Context c;
    private final drqd d;

    public drpa(Context context, drqd drqdVar) {
        this.c = context;
        this.d = drqdVar;
        if (context.isDeviceProtectedStorage()) {
            throw new IllegalStateException("DefaultRecentEmojiProvider should NOT work before unlock!");
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(String.valueOf(context.getPackageName()).concat("_private"), 0);
        this.b = sharedPreferences;
        String string = sharedPreferences.getString("pref_key_recent_emoji", "");
        this.a = TextUtils.isEmpty(string) ? new ArrayList() : new ArrayList(ejxk.b(',').i(string));
    }

    @Override // defpackage.dror
    public final ListenableFuture a() {
        return eork.i(ekgb.n(this.a));
    }

    @Override // defpackage.dros
    public final /* synthetic */ ListenableFuture b() {
        return droq.a(this);
    }

    @Override // defpackage.dros
    public final String c() {
        ekrg ekrgVar = drmh.a;
        return this.c.getString(R.string.emoji_category_recent);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        String string;
        List list = this.a;
        SharedPreferences.Editor editorEdit = this.b.edit();
        if (list.isEmpty()) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(',');
            }
            sb.deleteCharAt(sb.length() - 1);
            string = sb.toString();
        }
        editorEdit.putString("pref_key_recent_emoji", string).apply();
    }

    @Override // defpackage.dros
    public final /* synthetic */ void d(drto drtoVar) {
        droq.b(this, drtoVar);
    }

    @Override // defpackage.dror
    public final void e(String str) {
        List list = this.a;
        list.remove(str);
        list.add(0, str);
        this.d.a.R();
    }
}
