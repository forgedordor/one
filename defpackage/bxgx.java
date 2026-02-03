package defpackage;

import android.content.Context;
import android.util.SparseArray;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxgx extends bxgi {
    public static final eksp b = eksp.c("BugleImage");
    public static final int c = (int) TimeUnit.SECONDS.toMillis(5);
    public final bxgy d;
    public final cogw e;
    public final cpeo f;

    /* compiled from: PG */
    public interface a {
        cpeo iv();

        cogw y();
    }

    public bxgx(int i, String str, Context context) {
        super(i, str);
        this.d = new bxgy(this);
        a aVar = (a) ehli.a(context, a.class);
        this.f = aVar.iv();
        this.e = aVar.y();
    }

    @Override // defpackage.bxgi
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final synchronized bxgh a(String str, bxgh bxghVar) {
        if (bxgy.d(bxghVar) != 0) {
            bxgy bxgyVar = this.d;
            synchronized (bxgyVar.b) {
                int iD = bxgy.d(bxghVar);
                cqaz.k(iD != 0);
                SparseArray sparseArray = bxgyVar.a;
                LinkedList linkedList = (LinkedList) sparseArray.get(iD);
                if (linkedList == null) {
                    linkedList = new LinkedList();
                    sparseArray.put(iD, linkedList);
                }
                linkedList.addLast(bxghVar);
            }
        }
        return (bxgh) super.a(str, bxghVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bxgi, android.util.LruCache
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final synchronized void entryRemoved(boolean z, String str, bxgh bxghVar, bxgh bxghVar2) {
        if (bxgy.d(bxghVar) != 0) {
            bxgy bxgyVar = this.d;
            synchronized (bxgyVar.b) {
                int iD = bxgy.d(bxghVar);
                cqaz.k(iD != 0);
                LinkedList linkedList = (LinkedList) bxgyVar.a.get(iD);
                if (linkedList != null) {
                    linkedList.remove(bxghVar);
                }
            }
        }
        super.entryRemoved(z, str, bxghVar, bxghVar2);
    }

    public bxgx(String str, Context context) {
        this(5120, str, context);
    }
}
