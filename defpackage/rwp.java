package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.SAXException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rwp extends rxq implements rxo {
    public List a = new ArrayList();
    public Boolean b;
    public Matrix c;
    public String d;
    public int e;

    protected rwp() {
    }

    @Override // defpackage.rxo
    public final void b(rxs rxsVar) throws SAXException {
        if (!(rxsVar instanceof rxi)) {
            throw new SAXException(a.b(rxsVar, "Gradient elements cannot contain ", " elements."));
        }
        this.a.add(rxsVar);
    }

    @Override // defpackage.rxo
    public final List n() {
        return this.a;
    }
}
