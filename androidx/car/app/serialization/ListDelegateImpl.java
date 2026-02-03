package androidx.car.app.serialization;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.serialization.IRemoteList;
import androidx.car.app.serialization.ListDelegateImpl;
import androidx.car.app.utils.RemoteUtils;
import defpackage.clr;
import defpackage.cmb;
import defpackage.crf;
import defpackage.crq;
import defpackage.fdbq;
import java.util.List;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class ListDelegateImpl<T> implements crf<T> {
    private int _size;
    private int listHashCode;
    private IRemoteList mStub;

    /* compiled from: PG */
    public static final class RemoteListStub<T> extends IRemoteList.Stub {
        private final List<T> mContent;

        /* JADX WARN: Multi-variable type inference failed */
        public RemoteListStub(List<? extends T> list) {
            list.getClass();
            this.mContent = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object requestItemRange$lambda$0(RemoteListStub remoteListStub, int i, int i2) {
            return remoteListStub.mContent.subList(i, i2 + 1);
        }

        @Override // androidx.car.app.serialization.IRemoteList
        public void requestItemRange(final int i, final int i2, IOnDoneCallback iOnDoneCallback) {
            iOnDoneCallback.getClass();
            RemoteUtils.b(iOnDoneCallback, "lazy load content", new crq() { // from class: crg
                @Override // defpackage.crq
                public final Object a() {
                    return ListDelegateImpl.RemoteListStub.requestItemRange$lambda$0(this.a, i, i2);
                }
            });
        }
    }

    private ListDelegateImpl() {
        this._size = -1;
        this.listHashCode = -1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ListDelegateImpl) && ((ListDelegateImpl) obj).listHashCode == this.listHashCode;
    }

    public int getSize() {
        return this._size;
    }

    public int hashCode() {
        return this.listHashCode;
    }

    public void requestItemRange(int i, int i2, clr clrVar) {
        clrVar.getClass();
        try {
            IRemoteList iRemoteList = this.mStub;
            if (iRemoteList == null) {
                fdbq.c("mStub");
                iRemoteList = null;
            }
            iRemoteList.requestItemRange(i, i2, new RemoteUtils.AnonymousClass1(clrVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return "ListDelegate { Size: " + getSize() + ", listHashCode: " + this.listHashCode + " }";
    }

    public ListDelegateImpl(List<? extends T> list) {
        list.getClass();
        this._size = -1;
        this.listHashCode = -1;
        this._size = list.size();
        this.listHashCode = list.hashCode();
        this.mStub = new RemoteListStub(list);
    }
}
