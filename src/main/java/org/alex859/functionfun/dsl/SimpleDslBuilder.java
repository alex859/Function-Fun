package org.alex859.functionfun.dsl;

import org.alex859.functionfun.dsl.impl.SimpleDsl;

public interface SimpleDslBuilder<INPUT, OUTPUT> extends BeforeConditionAlternative<INPUT, OUTPUT>
{
    SimpleDsl<INPUT, OUTPUT> build();
}
