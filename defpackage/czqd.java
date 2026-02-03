package defpackage;

import android.net.Uri;
import android.os.Bundle;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czqd implements mtx {
    public final czpz a;
    public final aiwl b;
    public final aivw c;
    public final aiwo d;
    public final fcsu e;
    public ExoPlayer f;
    public czpx g;
    public cyqr h;
    public long i;
    public long j;
    public boolean k = false;

    public czqd(czpz czpzVar, aiwl aiwlVar, aivw aivwVar, aiwo aiwoVar, fcsu fcsuVar) {
        this.a = czpzVar;
        this.b = aiwlVar;
        this.c = aivwVar;
        this.d = aiwoVar;
        this.e = fcsuVar;
    }

    public static czpz k(Uri uri, int i, int i2, int i3, long j, boolean z) {
        czpz czpzVar = new czpz();
        eyhj.e(czpzVar);
        Bundle bundle = new Bundle();
        bundle.putParcelable(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
        bundle.putInt("opening_source", i);
        bundle.putInt("total_pages", i2);
        bundle.putInt("relative_index_to_start_page", i3);
        bundle.putLong("video_start_ts", j);
        bundle.putBoolean("start_playing_video", z);
        czpzVar.at(bundle);
        return czpzVar;
    }

    @Override // defpackage.mtx
    public final void c(mtv mtvVar, boolean z) {
        if (z) {
            this.j = mtvVar.a;
        } else {
            this.i += mtvVar.a - this.j;
        }
    }

    @Override // defpackage.mtx
    public final void f(int i) {
        if (i == 1) {
            aiwl aiwlVar = this.b;
            final emza emzaVarM = m();
            final emyn emynVarL = l();
            final long j = j();
            aiwlVar.k(new Supplier() { // from class: aiwi
                @Override // java.util.function.Supplier
                public final Object get() {
                    return aiwl.b(emzaVarM, emynVarL, 4, j);
                }
            });
        }
    }

    public final long j() {
        return TimeUnit.MILLISECONDS.toSeconds(this.f.z());
    }

    public final emyn l() {
        int i = this.a.m.getInt("relative_index_to_start_page");
        empq empqVar = (empq) emqj.a.createBuilder();
        empqVar.copyOnWrite();
        emqj emqjVar = (emqj) empqVar.instance;
        emqjVar.b |= 8;
        emqjVar.g = "video/";
        return aivt.a(i, 1, (emqj) empqVar.build(), false);
    }

    public final emza m() {
        czpz czpzVar = this.a;
        return aiwd.a(emyz.a(czpzVar.m.getInt("opening_source")), czpzVar.m.getInt("total_pages"));
    }

    @Override // defpackage.mtx
    public final /* synthetic */ void e(mbz mbzVar) {
    }

    @Override // defpackage.mtx
    public final /* synthetic */ void g(mpd mpdVar) {
    }

    @Override // defpackage.mtx
    public final /* synthetic */ void h(mde mdeVar) {
    }

    @Override // defpackage.mtx
    public final /* synthetic */ void i(boolean z) {
    }

    @Override // defpackage.mtx
    public final /* synthetic */ void a(mtv mtvVar, nej nejVar) {
    }

    @Override // defpackage.mtx
    public final /* synthetic */ void b(mcg mcgVar, mtw mtwVar) {
    }

    @Override // defpackage.mtx
    public final /* synthetic */ void d(mtv mtvVar, int i, long j) {
    }
}
