package androidx.car.app.messaging.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.messaging.model.IConversationCallback;
import androidx.car.app.utils.RemoteUtils;
import defpackage.clr;
import defpackage.cmb;
import defpackage.cna;
import defpackage.cnb;
import defpackage.crq;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public class ConversationCallbackDelegateImpl implements cnb {
    private final IConversationCallback mConversationCallbackBinder;

    /* compiled from: PG */
    @cmb
    public static class ConversationCallbackStub extends IConversationCallback.Stub {
        private final cna mConversationCallback;

        public ConversationCallbackStub(cna cnaVar) {
            this.mConversationCallback = cnaVar;
        }

        /* renamed from: lambda$onMarkAsRead$0$androidx-car-app-messaging-model-ConversationCallbackDelegateImpl$ConversationCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m220xf996ad9e() {
            this.mConversationCallback.a();
            return null;
        }

        /* renamed from: lambda$onTextReply$1$androidx-car-app-messaging-model-ConversationCallbackDelegateImpl$ConversationCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m221xc3f6a0cd(String str) {
            this.mConversationCallback.b(str);
            return null;
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onMarkAsRead(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onMarkAsRead", new crq() { // from class: cnd
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m220xf996ad9e();
                }
            });
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onTextReply(IOnDoneCallback iOnDoneCallback, final String str) {
            RemoteUtils.b(iOnDoneCallback, "onReply", new crq() { // from class: cnc
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m221xc3f6a0cd(str);
                }
            });
        }
    }

    private ConversationCallbackDelegateImpl() {
        this.mConversationCallbackBinder = null;
    }

    public void sendMarkAsRead(clr clrVar) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            iConversationCallback.getClass();
            iConversationCallback.onMarkAsRead(new RemoteUtils.AnonymousClass1(clrVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendTextReply(String str, clr clrVar) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            iConversationCallback.getClass();
            iConversationCallback.onTextReply(new RemoteUtils.AnonymousClass1(clrVar), str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public ConversationCallbackDelegateImpl(cna cnaVar) {
        this.mConversationCallbackBinder = new ConversationCallbackStub(cnaVar);
    }
}
