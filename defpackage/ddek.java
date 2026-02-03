package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.iid.MessengerCompat;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddek implements ServiceConnection {
    ddel c;
    final /* synthetic */ ddep f;
    int a = 0;
    final Messenger b = new Messenger(new ddmy(Looper.getMainLooper(), new Handler.Callback() { // from class: ddeg
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", a.g(i, "Received response to request: "));
            }
            ddek ddekVar = this.a;
            synchronized (ddekVar) {
                SparseArray sparseArray = ddekVar.e;
                ddem ddemVar = (ddem) sparseArray.get(i);
                if (ddemVar == null) {
                    Log.w("MessengerIpcClient", a.g(i, "Received response for unknown request: "));
                    return true;
                }
                sparseArray.remove(i);
                ddekVar.e();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    ddemVar.a(new dden(4, "Not supported by GmsCore"));
                    return true;
                }
                ddemVar.b(data);
                return true;
            }
        }
    }));
    final Queue d = new ArrayDeque();
    final SparseArray e = new SparseArray();

    public ddek(ddep ddepVar) {
        this.f = ddepVar;
    }

    final synchronized void a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
        }
        int i2 = this.a;
        if (i2 == 0) {
            throw new IllegalStateException();
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return;
            }
            this.a = 4;
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.a = 4;
        dcmt.a().b(this.f.a, this);
        dden ddenVar = new dden(i, str);
        Queue queue = this.d;
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            ((ddem) it.next()).a(ddenVar);
        }
        queue.clear();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.e;
            if (i3 >= sparseArray.size()) {
                sparseArray.clear();
                return;
            } else {
                ((ddem) sparseArray.valueAt(i3)).a(ddenVar);
                i3++;
            }
        }
    }

    final void b() {
        this.f.b.execute(new Runnable() { // from class: ddeh
            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                while (true) {
                    final ddek ddekVar = this.a;
                    synchronized (ddekVar) {
                        if (ddekVar.a != 2) {
                            return;
                        }
                        Queue queue = ddekVar.d;
                        if (queue.isEmpty()) {
                            ddekVar.e();
                            return;
                        }
                        final ddem ddemVar = (ddem) queue.poll();
                        dclh.m(ddemVar);
                        SparseArray sparseArray = ddekVar.e;
                        int i = ddemVar.a;
                        sparseArray.put(i, ddemVar);
                        ddekVar.f.b.schedule(new Runnable() { // from class: ddei
                            @Override // java.lang.Runnable
                            public final void run() {
                                ddekVar.d(ddemVar.a);
                            }
                        }, 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(ddemVar.toString()));
                        }
                        ddep ddepVar = ddekVar.f;
                        Messenger messenger = ddekVar.b;
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 1;
                        messageObtain.arg1 = i;
                        messageObtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", false);
                        bundle.putString("pkg", ddepVar.a.getPackageName());
                        bundle.putBundle(GroupManagementRequest.DATA_TAG, ddemVar.c);
                        messageObtain.setData(bundle);
                        try {
                            ddel ddelVar = ddekVar.c;
                            dclh.m(ddelVar);
                            Messenger messenger2 = ddelVar.a;
                            if (messenger2 != null) {
                                messenger2.send(messageObtain);
                            } else {
                                MessengerCompat messengerCompat = ddelVar.b;
                                if (messengerCompat == null) {
                                    throw new IllegalStateException("Both messengers are null");
                                }
                                messengerCompat.b(messageObtain);
                            }
                        } catch (RemoteException e) {
                            ddekVar.a(2, e.getMessage());
                        }
                    }
                }
            }
        });
    }

    final synchronized void c() {
        if (this.a == 1) {
            a(1, "Timed out while binding");
        }
    }

    final synchronized void d(int i) {
        SparseArray sparseArray = this.e;
        ddem ddemVar = (ddem) sparseArray.get(i);
        if (ddemVar != null) {
            Log.w("MessengerIpcClient", a.g(i, "Timing out request: "));
            sparseArray.remove(i);
            ddemVar.a(new dden(3, "Timed out waiting for response"));
            e();
        }
    }

    final synchronized void e() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.a = 3;
            dcmt.a().b(this.f.a, this);
        }
    }

    final synchronized boolean f(ddem ddemVar) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                this.d.add(ddemVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.d.add(ddemVar);
            b();
            return true;
        }
        this.d.add(ddemVar);
        dclh.h(this.a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        ddep ddepVar = this.f;
        if (dcmt.a().c(ddepVar.a, intent, this, 1)) {
            ddepVar.b.schedule(new Runnable() { // from class: ddej
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c();
                }
            }, 30L, TimeUnit.SECONDS);
        } else {
            a(0, "Unable to bind to service");
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            a(0, "Null service connection");
            return;
        }
        try {
            this.c = new ddel(iBinder);
            this.a = 2;
            b();
        } catch (RemoteException e) {
            a(0, e.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        a(2, "Service disconnected");
    }
}
