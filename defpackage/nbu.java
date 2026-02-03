package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nbu extends Handler {
    final /* synthetic */ nbw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbu(nbw nbwVar, Looper looper) {
        super(looper);
        this.a = nbwVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws MediaCodec.CryptoException {
        nbv nbvVar;
        nbw nbwVar = this.a;
        int i = message.what;
        if (i == 1) {
            nbvVar = (nbv) message.obj;
            int i2 = nbvVar.a;
            int i3 = nbvVar.b;
            try {
                nbwVar.c.queueInputBuffer(i2, 0, nbvVar.c, nbvVar.e, nbvVar.f);
            } catch (RuntimeException e) {
                nbt.a(nbwVar.f, e);
            }
        } else if (i != 2) {
            nbvVar = null;
            if (i == 3) {
                nbwVar.g.e();
            } else if (i != 4) {
                nbt.a(nbwVar.f, new IllegalStateException(String.valueOf(message.what)));
            } else {
                try {
                    nbwVar.c.setParameters((Bundle) message.obj);
                } catch (RuntimeException e2) {
                    nbt.a(nbwVar.f, e2);
                }
            }
        } else {
            nbvVar = (nbv) message.obj;
            int i4 = nbvVar.a;
            int i5 = nbvVar.b;
            MediaCodec.CryptoInfo cryptoInfo = nbvVar.d;
            long j = nbvVar.e;
            int i6 = nbvVar.f;
            try {
                synchronized (nbw.b) {
                    nbwVar.c.queueSecureInputBuffer(i4, 0, cryptoInfo, j, i6);
                }
            } catch (RuntimeException e3) {
                nbt.a(nbwVar.f, e3);
            }
        }
        if (nbvVar != null) {
            ArrayDeque arrayDeque = nbw.a;
            synchronized (arrayDeque) {
                arrayDeque.add(nbvVar);
            }
        }
    }
}
