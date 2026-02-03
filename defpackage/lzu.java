package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lzu extends Handler {
    final /* synthetic */ lzx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzu(lzx lzxVar, Looper looper) {
        super(looper);
        this.a = lzxVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        lzv[] lzvVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        lzx lzxVar = this.a;
        while (true) {
            synchronized (lzxVar.b) {
                ArrayList arrayList = lzxVar.d;
                size = arrayList.size();
                if (size <= 0) {
                    return;
                }
                lzvVarArr = new lzv[size];
                arrayList.toArray(lzvVarArr);
                arrayList.clear();
            }
            for (int i = 0; i < size; i++) {
                lzv lzvVar = lzvVarArr[i];
                ArrayList arrayList2 = lzvVar.b;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    lzw lzwVar = (lzw) arrayList2.get(i2);
                    if (!lzwVar.d) {
                        lzwVar.b.onReceive(lzxVar.a, lzvVar.a);
                    }
                }
            }
        }
    }
}
