package defpackage;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dfnb {
    public String a;
    public dfnn b;
    protected HandlerThread c;

    protected dfnb() {
    }

    public final Message a(int i) {
        return Message.obtain(this.b, i);
    }

    public final Message b(int i, Object obj) {
        return Message.obtain(this.b, i, obj);
    }

    public final Message c(int i, int i2, int i3, Object obj) {
        return Message.obtain(this.b, i, i2, i3, obj);
    }

    public final dfmy d() {
        dfnn dfnnVar = this.b;
        if (dfnnVar == null) {
            return null;
        }
        return dfnnVar.b();
    }

    public final void e(dfmy dfmyVar) {
        this.b.c(dfmyVar, null);
    }

    public final void f(dfmy dfmyVar, dfmy dfmyVar2) {
        this.b.c(dfmyVar, dfmyVar2);
    }

    public final void g(Message message) {
        dfnn dfnnVar = this.b;
        Message messageObtainMessage = dfnnVar.obtainMessage();
        messageObtainMessage.copyFrom(message);
        dfnnVar.l.add(messageObtainMessage);
    }

    protected void h(String str) {
        Log.e(this.a, str);
    }

    protected void i(String str) {
        Log.i(this.a, str);
    }

    public final void m() {
        i("quit");
        dfnn dfnnVar = this.b;
        if (dfnnVar == null) {
            return;
        }
        dfnnVar.sendMessage(dfnnVar.obtainMessage(-1, dfnn.a));
    }

    public final void n() {
        i("quitNow");
        dfnn dfnnVar = this.b;
        if (dfnnVar == null) {
            return;
        }
        dfnnVar.sendMessageAtFrontOfQueue(dfnnVar.obtainMessage(-1, dfnn.a));
    }

    public final void o(dfmx dfmxVar) {
        this.b.i.add(dfmxVar);
    }

    public final void p(int i) {
        dfnn dfnnVar = this.b;
        if (dfnnVar == null) {
            return;
        }
        dfnnVar.removeMessages(i);
    }

    public final void q(int i) {
        dfnn dfnnVar = this.b;
        if (dfnnVar == null) {
            return;
        }
        dfnnVar.sendMessage(a(i));
    }

    public final void r(int i, int i2) {
        dfnn dfnnVar = this.b;
        if (dfnnVar == null) {
            return;
        }
        dfnnVar.sendMessage(Message.obtain(dfnnVar, i, i2, 0));
    }

    public final void s(int i, Object obj) {
        dfnn dfnnVar = this.b;
        if (dfnnVar == null) {
            return;
        }
        dfnnVar.sendMessage(b(i, obj));
    }

    public final void t(int i, long j) {
        dfnn dfnnVar = this.b;
        if (dfnnVar == null) {
            return;
        }
        dfnnVar.sendMessageDelayed(a(i), j);
    }

    public final String toString() {
        String string;
        String string2 = "(null)";
        try {
            string = this.a.toString();
            try {
                string2 = this.b.b().a().toString();
            } catch (NullPointerException unused) {
            }
        } catch (NullPointerException unused2) {
            string = "(null)";
        }
        return a.n(string2, string, "name=", " state=");
    }

    public final void u(dfmy dfmyVar) {
        this.b.k = dfmyVar;
    }

    public void v() {
        dfmy dfmyVar;
        i(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME);
        dfnn dfnnVar = this.b;
        if (dfnnVar == null) {
            return;
        }
        HashMap map = dfnnVar.j;
        int i = 0;
        for (dfnm dfnmVar : map.values()) {
            int i2 = 0;
            for (; dfnmVar != null; dfnmVar = dfnmVar.b) {
                i2++;
            }
            if (i < i2) {
                i = i2;
            }
        }
        dfnnVar.b = new dfnm[i];
        dfnnVar.d = new dfnm[i];
        if (dfnnVar.k == null) {
            dfnm dfnmVar2 = null;
            dfnm dfnmVar3 = null;
            for (dfnm dfnmVar4 : map.values()) {
                if (dfnmVar4.b == null && (dfmyVar = dfnmVar4.a) != dfnnVar.f && dfmyVar != dfnnVar.g) {
                    if (dfnmVar3 == null) {
                        dfnmVar3 = dfnmVar4;
                    } else {
                        Log.e(dfnnVar.h.a, "state machines with multiple root states must be initialized via setInitialstate");
                    }
                }
            }
            if (dfnmVar3 == null) {
                Log.e(dfnnVar.h.a, "state machines must contain a root state");
            } else {
                dfnmVar2 = dfnmVar3;
            }
            dfnnVar.k = dfnmVar2.a;
        }
        dfnm dfnmVar5 = (dfnm) map.get(dfnnVar.k);
        dfnnVar.e = 0;
        while (dfnmVar5 != null) {
            dfnm[] dfnmVarArr = dfnnVar.d;
            int i3 = dfnnVar.e;
            dfnmVarArr[i3] = dfnmVar5;
            dfnmVar5 = dfnmVar5.b;
            dfnnVar.e = i3 + 1;
        }
        dfnnVar.c = -1;
        dfnnVar.a();
        dfnnVar.f();
    }

    public final void w(dfmy dfmyVar) {
        this.b.e(dfmyVar);
        l();
    }

    protected dfnb(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        this.c = handlerThread;
        dqli.a(handlerThread);
        this.c.start();
        Looper looper = this.c.getLooper();
        this.a = str;
        this.b = new dfnn(looper, this);
    }

    protected void j() {
    }

    protected void k() {
    }

    protected void l() {
    }
}
