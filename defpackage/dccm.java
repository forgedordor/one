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
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dccm implements ServiceConnection {
    dccn c;
    final /* synthetic */ dccs f;
    int a = 0;
    final Messenger b = new Messenger(new ddmy(Looper.getMainLooper(), new Handler.Callback() { // from class: dccl
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", a.g(i, "Received response to request: "));
            }
            dccm dccmVar = this.a;
            synchronized (dccmVar) {
                SparseArray sparseArray = dccmVar.e;
                dccp dccpVar = (dccp) sparseArray.get(i);
                if (dccpVar == null) {
                    Log.w("MessengerIpcClient", a.g(i, "Received response for unknown request: "));
                    return true;
                }
                sparseArray.remove(i);
                dccmVar.d();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    dccpVar.c(new dccq("Not supported by GmsCore"));
                    return true;
                }
                dccpVar.a(data);
                return true;
            }
        }
    }));
    final Queue d = new ArrayDeque();
    final SparseArray e = new SparseArray();

    public dccm(dccs dccsVar) {
        this.f = dccsVar;
    }

    final void a() {
        this.f.b.execute(new Runnable() { // from class: dcch
            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                while (true) {
                    final dccm dccmVar = this.a;
                    synchronized (dccmVar) {
                        if (dccmVar.a != 2) {
                            return;
                        }
                        Queue queue = dccmVar.d;
                        if (queue.isEmpty()) {
                            dccmVar.d();
                            return;
                        }
                        final dccp dccpVar = (dccp) queue.poll();
                        SparseArray sparseArray = dccmVar.e;
                        int i = dccpVar.a;
                        sparseArray.put(i, dccpVar);
                        dccmVar.f.b.schedule(new Runnable() { // from class: dccj
                            @Override // java.lang.Runnable
                            public final void run() {
                                dccmVar.c(dccpVar.a);
                            }
                        }, 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(String.valueOf(dccpVar))));
                        }
                        dccs dccsVar = dccmVar.f;
                        Messenger messenger = dccmVar.b;
                        int i2 = dccpVar.c;
                        Message messageObtain = Message.obtain();
                        messageObtain.what = i2;
                        messageObtain.arg1 = i;
                        messageObtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", dccpVar.b());
                        bundle.putString("pkg", dccsVar.a.getPackageName());
                        bundle.putBundle(GroupManagementRequest.DATA_TAG, dccpVar.d);
                        messageObtain.setData(bundle);
                        try {
                            dccn dccnVar = dccmVar.c;
                            Messenger messenger2 = dccnVar.a;
                            if (messenger2 != null) {
                                messenger2.send(messageObtain);
                            } else {
                                CloudMessagingMessengerCompat cloudMessagingMessengerCompat = dccnVar.b;
                                if (cloudMessagingMessengerCompat == null) {
                                    throw new IllegalStateException("Both messengers are null");
                                }
                                cloudMessagingMessengerCompat.b(messageObtain);
                            }
                        } catch (RemoteException e) {
                            dccmVar.g(e.getMessage());
                        }
                    }
                }
            }
        });
    }

    final synchronized void b() {
        if (this.a == 1) {
            g("Timed out while binding");
        }
    }

    final synchronized void c(int i) {
        SparseArray sparseArray = this.e;
        dccp dccpVar = (dccp) sparseArray.get(i);
        if (dccpVar != null) {
            Log.w("MessengerIpcClient", a.g(i, "Timing out request: "));
            sparseArray.remove(i);
            dccpVar.c(new dccq("Timed out waiting for response"));
            d();
        }
    }

    final synchronized void d() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.a = 3;
            dcmt.a().b(this.f.a, this);
        }
    }

    final synchronized boolean e(dccp dccpVar) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                this.d.add(dccpVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.d.add(dccpVar);
            a();
            return true;
        }
        this.d.add(dccpVar);
        dclh.h(this.a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            dcmt dcmtVarA = dcmt.a();
            dccs dccsVar = this.f;
            if (dcmtVarA.c(dccsVar.a, intent, this, 1)) {
                dccsVar.b.schedule(new Runnable() { // from class: dcci
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                g("Unable to bind to service");
            }
        } catch (SecurityException e) {
            f("Unable to bind to service", e);
        }
        return true;
    }

    final synchronized void f(String str, Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
        }
        int i = this.a;
        if (i == 0) {
            throw new IllegalStateException();
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
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
        dccq dccqVar = new dccq(str, th);
        Queue queue = this.d;
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            ((dccp) it.next()).c(dccqVar);
        }
        queue.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.e;
            if (i2 >= sparseArray.size()) {
                sparseArray.clear();
                return;
            } else {
                ((dccp) sparseArray.valueAt(i2)).c(dccqVar);
                i2++;
            }
        }
    }

    final synchronized void g(String str) {
        f(str, null);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        dccs dccsVar = this.f;
        dccsVar.b.execute(new Runnable() { // from class: dccg
            @Override // java.lang.Runnable
            public final void run() {
                dccm dccmVar = this.a;
                IBinder iBinder2 = iBinder;
                synchronized (dccmVar) {
                    try {
                        if (iBinder2 == null) {
                            dccmVar.g("Null service connection");
                            return;
                        }
                        try {
                            dccmVar.c = new dccn(iBinder2);
                            dccmVar.a = 2;
                            dccmVar.a();
                        } catch (RemoteException e) {
                            dccmVar.g(e.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        dccs dccsVar = this.f;
        dccsVar.b.execute(new Runnable() { // from class: dcck
            @Override // java.lang.Runnable
            public final void run() {
                this.a.g("Service disconnected");
            }
        });
    }
}
