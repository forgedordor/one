package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eage implements Externalizable {
    private static final long serialVersionUID = 1;
    public final List a = new ArrayList();

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            eagd eagdVar = new eagd();
            eagdVar.readExternal(objectInput);
            this.a.add(eagdVar);
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        List list = this.a;
        int size = list.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((eagd) list.get(i)).writeExternal(objectOutput);
        }
    }
}
