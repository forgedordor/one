package defpackage;

import com.android.vcard.VCardConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class femc {
    private static final Charset f = Charset.forName("UTF-8");
    public final ferh a;
    protected fems b;
    protected femz c;
    protected femz d;
    protected feou e;
    private final femd g;
    private final femm h;
    private List i;

    public femc() {
        femd femdVarA = feme.a.a();
        ferb ferbVar = new ferb();
        feoq feoqVar = new feoq();
        ferh ferhVarA = feri.a.a();
        this.g = femdVarA;
        this.a = ferhVarA;
        this.h = new femb(this, fena.a, ferbVar, feoqVar);
    }

    public static final void b(feou feouVar) {
        if (feouVar == null) {
            throw new femy("Expected property not initialised");
        }
    }

    private final void c() {
        ferg fergVarA;
        for (feou feouVar : this.i) {
            feno fenoVarB = feouVar.b("TZID");
            if (fenoVarB != null && (fergVarA = this.a.a(fenoVarB.a())) != null) {
                String strA = feouVar.a();
                if (feouVar instanceof feuq) {
                    ((feuq) feouVar).e(fergVarA);
                } else if (feouVar instanceof feup) {
                    ((feup) feouVar).d(fergVarA);
                }
                try {
                    feouVar.c(strA);
                } catch (URISyntaxException e) {
                    throw new femy(e);
                } catch (ParseException e2) {
                    throw new femy(e2);
                }
            }
        }
    }

    public final fems a(InputStream inputStream) throws IOException, femo {
        femp fempVar = new femp(new InputStreamReader(inputStream, f));
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.i = new ArrayList();
        StreamTokenizer streamTokenizer = new StreamTokenizer(fempVar);
        femm femmVar = this.h;
        femd femdVar = this.g;
        try {
            streamTokenizer.resetSyntax();
            streamTokenizer.wordChars(32, 255);
            streamTokenizer.whitespaceChars(0, 20);
            streamTokenizer.ordinaryChar(58);
            streamTokenizer.ordinaryChar(59);
            streamTokenizer.ordinaryChar(61);
            streamTokenizer.ordinaryChar(9);
            streamTokenizer.eolIsSignificant(true);
            streamTokenizer.whitespaceChars(0, 0);
            streamTokenizer.quoteChar(34);
            ((feml) femdVar).c(streamTokenizer, fempVar, VCardConstants.PROPERTY_BEGIN, true);
            ((feml) femdVar).b(streamTokenizer, fempVar, 58);
            ((feml) femdVar).c(streamTokenizer, fempVar, "VCALENDAR", true);
            ((feml) femdVar).b(streamTokenizer, fempVar, 10);
            ((femb) femmVar).d.b = new fems();
            ((feml) femdVar).d.a(streamTokenizer, fempVar, femmVar);
            femf femfVar = ((feml) femdVar).b;
            while (VCardConstants.PROPERTY_BEGIN.equalsIgnoreCase(streamTokenizer.sval)) {
                feml femlVar = femfVar.a;
                femlVar.c.a(streamTokenizer, fempVar, femmVar);
                femlVar.a(streamTokenizer, fempVar);
            }
            ((feml) femdVar).b(streamTokenizer, fempVar, 58);
            ((feml) femdVar).c(streamTokenizer, fempVar, "VCALENDAR", true);
            if (this.i.size() > 0) {
                c();
            }
            return this.b;
        } catch (Exception e) {
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            if (e instanceof femo) {
                throw ((femo) e);
            }
            throw new femo(e.getMessage(), feml.d(streamTokenizer, fempVar), e);
        }
    }
}
