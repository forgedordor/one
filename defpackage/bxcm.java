package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioManager;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxcm implements bxam {
    public final fcsu a;
    private final AudioManager b;

    public bxcm(Context context, fcsu fcsuVar) {
        this.b = (AudioManager) context.getSystemService("audio");
        this.a = fcsuVar;
    }

    @Override // defpackage.bxam
    public final /* synthetic */ int e(Exception exc, int i, dqtx dqtxVar) {
        return 1;
    }

    @Override // defpackage.bxam
    public final Closeable m(dqtx dqtxVar) {
        AudioManager audioManager;
        if (!((crqv) this.a.b()).q("sound_for_debug_plugin_enabled_key", false) || (audioManager = this.b) == null) {
            return null;
        }
        switch (((dqov) dqtxVar).b) {
            case QUERY:
            case READ:
                audioManager.playSoundEffect(1);
                break;
            case WRITE:
            case INSERT:
            case DELETE:
            case UPDATE:
                audioManager.playSoundEffect(2);
                break;
            case BEGIN_TRANSACTION:
                audioManager.playSoundEffect(9);
                break;
        }
        return null;
    }

    @Override // defpackage.bxam
    public final boolean o() {
        return cqbe.c();
    }

    @Override // defpackage.bxam
    public final /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.bxam
    public final /* synthetic */ Cursor a(Cursor cursor, dqtx dqtxVar) {
        return cursor;
    }
}
