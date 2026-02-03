package defpackage;

import com.google.speech.grammar.pumpkin.ActionFrameManager;
import com.google.speech.grammar.pumpkin.Tagger;
import com.google.speech.grammar.pumpkin.UserValidators;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class exwv {
    public ActionFrameManager c;
    public Tagger d;
    protected UserValidators e;

    static {
        Logger.getLogger(exwv.class.getName());
    }

    protected exwq a() {
        throw null;
    }

    public synchronized void b() {
        if (this.c == null) {
            this.c = new ActionFrameManager();
        }
        exwq exwqVarA = a();
        if (this.d == null) {
            this.d = new Tagger(exwqVarA);
        }
        if (this.e == null) {
            this.e = new UserValidators(exwqVarA);
        }
    }
}
