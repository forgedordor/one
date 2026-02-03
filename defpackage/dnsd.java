package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnsd implements dror {
    public final dnna a;
    private final Context b;
    private final fdjx c;

    public dnsd(Context context, fdjx fdjxVar, dnna dnnaVar) {
        context.getClass();
        fdjxVar.getClass();
        this.b = context;
        this.c = fdjxVar;
        this.a = dnnaVar;
    }

    @Override // defpackage.dror
    public final ListenableFuture a() {
        return fdxs.b(this.c, fcyi.a, fdjz.a, new dnsc(this, null));
    }

    @Override // defpackage.dros
    public final /* synthetic */ ListenableFuture b() {
        return droq.a(this);
    }

    @Override // defpackage.dros
    public final String c() throws Resources.NotFoundException {
        String string = this.b.getResources().getString(R.string.emoji_recents_category);
        string.getClass();
        String upperCase = string.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }

    @Override // defpackage.dros
    public final /* synthetic */ void d(drto drtoVar) {
        droq.b(this, drtoVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.dror
    public final void e(String str) {
    }
}
